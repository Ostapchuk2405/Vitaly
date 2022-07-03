/**
 * 
 */
package part7ClassesAndMethodsMore;

/**
 * ��������� vararg � ����������
 * 
 * @author Shiltd
 *
 */
public class VarArg3 {

	/**
	 * @param args
	 */

	static void vaTest(int... v) {
		System.out.print("vaTest(int ...): " + " ���������� ����������: " + v.length + " �����������: ");
		for (int x : v)
			System.out.print(x + " ");
		System.out.println();
	}

	static void vaTest(boolean... v) {
		System.out.println("vaTest(boolean ...): " + " ���������� ����������: " + v.length + " ����������: ");
		for (boolean x : v)
			System.out.print(x + " ");
		System.out.println();
	}

	static void vaTest(String msg, int... v) {
		System.out.print("vaTest(String msg, int ...): " + msg + v.length + " ����������: ");
		for (int x : v)
			System.out.print(x + " ");
		System.out.println();
	}

	public static void main(String[] args) {

		vaTest(1, 2, 3);
		vaTest("��������: ", 10, 20);
		vaTest(true, false, false);
	}

}
