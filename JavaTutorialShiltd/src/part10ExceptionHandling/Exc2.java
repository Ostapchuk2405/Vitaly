/**
 * 
 */
package part10ExceptionHandling;

/**
 * @author Shiltd
 *
 */
class Exc2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a, d;

		try {
			d = 0;
			a = 42 / d;
			System.out.println("��� �� ����� ��������.");
		} catch (ArithmeticException e) {
			System.out.println("������� �� ����.");
		}
		System.out.println("����� ����� Catch.");
	}

}
