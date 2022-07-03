/**
 * 
 */
package part10ExceptionHandling;

/**
 * Подкласс должен идти перед его суперулассом в последовательности операторов
 * catch. В противном случае будет создан недопустимый код, что приведёт к
 * ошибке компиляции.
 * 
 * @author Shiltd
 *
 */
class SuperSubCatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			int a = 0;
			int b = 42 / a;
		} catch (Exception e) {
			System.out.println("Общий перехват Exception.");
//		} catch (ArithmeticException e) {
//			System.out.println("Это никогда не выполнится.");
		}
	}

}
