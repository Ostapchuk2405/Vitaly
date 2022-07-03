/**
 * 
 */
package part10ExceptionHandling;

/**
 * 
 * Демонстрация finally
 * 
 * @author Shiltd
 *
 */
class FinallyDemo {

	/**
	 * @param args
	 */

	static void procA() {
		try {
			System.out.println("Inside procA");
			throw new RuntimeException("demo");
		} finally {
			System.out.println("Block finally procA");
		}
	}

	static void procB() {
		try {
			System.out.println("Inside procB");
			return;
		} finally {
			System.out.println("Block finally procB");
		}
	}

	static void procC() {
		try {
			System.out.println("Inside procC");

		} finally {
			System.out.println("Block finally procC");
		}
	}

	public static void main(String[] args) {

		try {
			procA();
		} catch (Exception e) {
			System.out.println("Исключение перехвачено");
		}
		procB();
		procC();
	}

}
