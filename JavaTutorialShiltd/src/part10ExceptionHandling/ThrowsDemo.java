/**
 * 
 */
package part10ExceptionHandling;

/**
 * 
 * Демонстрация throws
 * @author Shiltd
 *
 */
class ThrowsDemo {

	/**
	 * @param args
	 */
	
	static void throwOne() throws IllegalAccessException{
		System.out.println("Внутри");
		throw new IllegalAccessException("demo");
	}
	
	public static void main(String[] args) {

		try {
			throwOne();
		} catch (IllegalAccessException e) {
			System.out.println("Перехвачено " + e);
		}
	}

}
