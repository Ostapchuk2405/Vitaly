/**
 * 
 */
package part13InOutAppletOther.other;

/**
 * Демонстрация assert
 * 
 * @author Shiltd
 *
 */
class AssertDemo {

	/**
	 * @param args
	 */

	static int val = 3;

	static int getNum() {
		return val--;
	}

	public static void main(String[] args) {

		int n;

		for (int i = 0; i < 10; i++) {
			n = getNum();

//			assert n > 0; // Вызовет сбой, если n == 0

			assert n > 0 : "n is nagative!";

			System.out.println("n = " + n);
		}

	}
}
