import java.util.Iterator;

public class DefaultMyList implements MyList, ListIterable {
	
	private Node first;
	private Node last;
	private int size;
	
	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return new IteratorImpl();
	}

	@Override
	public void add(Object element) {
		// TODO Auto-generated method stub
		final Node lastNode = last;
        final Node newNode = new Node(lastNode, element, null);
        last = newNode;
        if (lastNode == null) {
			first = newNode;
		} else {
			lastNode.next = newNode;
		}
        size++;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		for (Node x = first; x != null; ) {
			Node next = x.next;
			x.data = null;
			x.next = null;
			x.previous = null;
			x = next;
		}
		last = null;
		first = null;
		size = 0;
	}

	@Override
	public boolean remove(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null) {
			for (Node x = first; x != null; x = x.next) {
				if (x.data == null) {
					unlink(x);
					return true;
				}
			}		
		} else {
			for (Node x = first; x != null; x = x.next) {
				if (x.data.equals(obj)) {
					unlink(x);
					return true;
				}
			}
		}
		return false;
	}
	
	public remoteNodeByIndex(int index) {
		return unlink(getNodeByIndex(index));
	}
	
	Object unlink(Node element) {
		Object obj = element.data;
		Node next = element.next;
		Node previous = element.previous;
			
		if (previous == null) {
			first = next;
		} else {
			previous.next = next;
			element.previous = null;
		}
		if (next == null) {
			last = previous;
		} else {
			next.previous = previous;
			element.next = null;
		}
			
		element.data = null;
		size--;
		return obj;	
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		Object[] result = new Object[size];
		int index = 0;
		for (Node x = first; x != null; x = x.next) {
			result[index++] = x.data;
		}
		return result;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		if (o == null) {
			for (Node x = first; x != null; x = x.next) {
				if (x.data == null) {
					return true;
				}
			}
		} else {
			for (Node x = first; x != null; x = x.next) {
				if (x.data.equals(o)) {
					return true;
				}
			}
		}
		
		return false;
	}

	@Override
	public boolean containsAll(MyList c) {
		// TODO Auto-generated method stub
		Object[] array = c.toArray();
		for (int i = 0; i < array.length; i++) {
			if (!contains(array[i])) {
				return false;
			};
		}	
		return true;
	}
	
	private Node getNodeByIndex(int index) {
		if (index > (size -1)) {
			return null;
		}
		
		if (index < (size >> 1)) {
            Node x = first;
            for (int i = 0; i < index; i++) {
				x = x.next;
			}
            return x;
        } else {
            Node x = last;
            for (int i = size - 1; i > index; i--) {
				x = x.previous;
			}
            return x;
        }
	}
	
	@Override
	public ListIterator listIterator() {
		return new ListIteratorImpl();
	}
	
	private class ListIteratorImpl extends IteratorImpl 
	implements ListIterator {
		
		@Override
		public boolean hasPrevious() {
			return cursor != 0;
		}
	}
	
	@Override
	public Object previous() {
		cursor -= 1;
		Object previous = getNodeByIndex(cursor);
		if (previous == null) {
			cursor = 0;
			throw new NoSuchElementException();
		}
		lastRet = cursor;
		return previous;
	}
	@Override
	public void set(Object element) {
		if (lastRet < 0) {
			throw new IllegalStateException();
		}	
		Node x = getNodeByIndex(lastRet);
		x.data = element;
		lastRet = -1;			
	}
	
private class IteratorImpl implements Iterator<Object> {
		
		
		int cursor = 0;
		int lastRet = -1;
		
		@Override
		public boolean hasNext() {
			return cursor != size;
		}
		
		@Override
		public Object next() {
			Object next = getNodeByIndex(cursor);
			if (next == null) {
				throw new NoSuchElementException();
			}
			lastRet = cursor;
			cursor += 1;
			return next;	
		}
		
		@Override
		public void remove() {
			if (lastRet < 0) {
				throw new IllegalStateException();
			}
			DefaultMyList.this.removeNodeByIndex(lastRet);
			if (lastRet < cursor) {
				cursor--;
			}
            lastRet = -1;
		}
		
		private static class Node {
			private Object data;
			private Node next;
			private Node previous;
			
			public Node(Node previous, Object data, Node next) {
				this.next = next;
				this.previous = previous;
				this.data = data;
			}
				
			@Override
			public String toString() {
				return data.toString();
			}
}
}
}