/**
 * 
 */
package part7ClassesAndMethodsMore;

/**
 * ������ ���������� stck � tos �������� ���������
 * 
 * @author Shiltd
 *
 */
class Stack {

	private int stck[] = new int[10];
	private int tos;

//	������������� �������� �����
	public Stack() {
		tos = -1;
	}

	void push(int item) {
		if (tos == 9)
			System.out.println("���� �����.");
		else
			stck[++tos] = item;
	}

	int pop() {
		if (tos < 0) {
			System.out.println("���� �� ��������.");
			return 0;
		} else {
			return stck[tos--];
		}
	}
}
