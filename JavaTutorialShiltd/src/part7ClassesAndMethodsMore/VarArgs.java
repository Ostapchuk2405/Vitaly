/**
 * 
 */
package part7ClassesAndMethodsMore;

/**
 * ������������ ������������� ������ ���������� ���������� ������
 * 
 * @author Shiltd
 *
 */
class VarArgs {

	/**
	 * @param args
	 */

	static void vaTest(int... v) {
		System.out.print("���������� ����������: " + v.length + " ����������");
		for (int x : v)
			System.out.print(x + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		vaTest(10);
		vaTest(1, 2, 3);
		vaTest();
	}

}
