/**
 * 
 */
package part10ExceptionHandling;

/**
 * 
 * ������������ ���������� throw.
 * 
 * @author Shiltd
 *
 */
class ThrowDemo {

	/**
	 * @param args
	 */

	static void demoproc() {
		try {
			throw new NullPointerException("demo");
		} catch (NullPointerException e) {
			System.out.println("����������� ������.");
			throw e;
		}
	}

	public static void main(String[] args) {

		try {
			demoproc();
		} catch (NullPointerException e) {
			System.out.println("��������� ��������.");
		}
	}

}
