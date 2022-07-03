/**
 * 
 */
package part7ClassesAndMethodsMore;

/**
 * Теперь переменные stck и tos являются закрытыми
 * 
 * @author Shiltd
 *
 */
class Stack {

	private int stck[] = new int[10];
	private int tos;

//	инициализация верхушки стэка
	public Stack() {
		tos = -1;
	}

	void push(int item) {
		if (tos == 9)
			System.out.println("Стэк полон.");
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
