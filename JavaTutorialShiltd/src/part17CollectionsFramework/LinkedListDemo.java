/**
 * 
 */
package part17CollectionsFramework;

import java.util.*;

/**
 * Демонстрация применения LinkedList
 * 
 * @author Shiltd
 *
 */
class LinkedListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		Создать связный список
		LinkedList<String> ll = new LinkedList<String>();

//		добавить элементы в связный список
		ll.add("F");
		ll.add("B");
		ll.add("D");
		ll.add("E");
		ll.add("C");
		ll.addLast("Z");
		ll.addFirst("A");

		ll.add(1, "A2");

		System.out.println("Исходное содержание ll: " + ll);

//		удалить элементы из связного списка
		ll.remove("F");
		ll.remove(2);
		System.out.println("Содержание ll после удаления: " + ll);

//		удалить первый и последний элемент
		ll.removeFirst();
		ll.removeLast();

		System.out.println("ll после удаления первого и последнего: " + ll);

//		получить и присвоить значение
		String val = ll.get(2);
		ll.set(2, val + " Изменён");

		System.out.println("ll после изменения: " + ll);
	}

}
