/**
 * 
 */
package part7ClassesAndMethodsMore;

/**
 * ������� ������ ��������
 * 
 * @author Shiltd
 *
 */

class Factorial {

	int fact(int n) {
		int result;
		if (n == 1)
			return 1;
		result = fact(n - 1) * n;
		return result;
	}
}

 class Recursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Factorial f = new Factorial();

		System.out.println("��������� 3 ����� " + f.fact(3));
		System.out.println("��������� 4 ����� " + f.fact(4));
		System.out.println("��������� 5 ����� " + f.fact(5));
	}

}
