/**
 * 
 */
package part7ClassesAndMethodsMore;

/**
 * ������������ ���� ���������� �� ��������
 * 
 * @author Shiltd
 *
 */

class Test2 {
	void meth(int i, int j) {
		i *= 2;
		j /= 2;
	}
}

 class CallByValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Test2 ob = new Test2();

		int a = 15, b = 20;
		System.out.println("a & b ����� �������: " + a + " " + b);

		ob.meth(a, b);
//		�� ��������� �������� ������� ��� ������
		System.out.println("a & b ����� ������: " + a + " " + b);
	}

}
