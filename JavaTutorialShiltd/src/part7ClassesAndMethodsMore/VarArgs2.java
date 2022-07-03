/**
 * 
 */
package part7ClassesAndMethodsMore;

/**
 * ������������� ������ ���������� ���������� ������ ��������� �� ������������
 * �����������
 * 
 * @author Shiltd
 *
 */
public class VarArgs2 {

	/**
	 * @param args
	 */

	static void vaTest(String msg, int... v) {
		System.out.print(msg + v.length + " ����������: ");
		for (int x : v)
			System.out.print(x + " ");
		System.out.println();
	}

	public static void main(String[] args) {

		vaTest("���� �������� vararg: ", 10);
		vaTest("��� ��������� vararg: ", 1, 2, 3);
		vaTest("��� ���������� vararg: ");
	}

}
