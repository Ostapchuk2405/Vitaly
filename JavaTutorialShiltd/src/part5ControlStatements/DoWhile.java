/**
 * 
 */
package part5ControlStatements;

/**
 * ������������ ������������� ����� do-while
 * 
 * @author Shiltd
 *
 */
public class DoWhile {

	/**
	 * @param args ��� �� ���� ��� � � class while
	 */
	public static void main(String[] args) {

		int n = 10;

		do {
			System.out.println("���� " + n);
			n--;
		} while (n > 0);

//		��� ����� �������
//		do {
//			System.out.println("���� " + n);
//		} while (--n > 0);
	}

}
