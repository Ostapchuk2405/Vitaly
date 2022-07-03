/**
 * 
 */
package part7ClassesAndMethodsMore;

/**
 * @author Admin
 *
 */

class ImprovedStack {
	private int stck[];
	private int tos;

//	резервирование и инициализация стэка
	public ImprovedStack(int size) {
		stck = new int[size];
		tos = -1;
	}

	void push(int item) {
		if (tos == stck.length - 1)
			System.out.println("Стэк полон");
		else
			stck[++tos] = item;
	}

	int pop() {
		if (tos < 0) {
			System.out.println("Стэк не загружен.");
			return 0;
		} else {
			return stck[tos--];
		}
	}
}

class TestStack2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ImprovedStack mystack1 = new ImprovedStack(5);
		ImprovedStack mystack2 = new ImprovedStack(8);

		for (int i = 0; i < 5; i++)
			mystack1.push(i);
		for (int i = 0; i < 8; i++)
			mystack2.push(i);

		System.out.println("Стэк в mystack1:");
		for (int i = 0; i < 5; i++)
			System.out.println(mystack1.pop());

		System.out.println("Стэк в mystack2:");
		for (int i = 0; i < 8; i++)
			System.out.println(mystack2.pop());
	}

}
