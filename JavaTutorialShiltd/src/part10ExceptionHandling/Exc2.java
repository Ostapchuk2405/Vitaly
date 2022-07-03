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
			System.out.println("Это не будет выведено.");
		} catch (ArithmeticException e) {
			System.out.println("Деление на ноль.");
		}
		System.out.println("После блока Catch.");
	}

}
