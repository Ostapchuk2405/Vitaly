/**
 * 
 */
package part10ExceptionHandling;

/**
 * Демонстрирует применение собственного класса исключения MyException
 * 
 * @author Shiltd
 *
 */
class ExceptionDemo {

	/**
	 * @param args
	 */

	static void compute(int a) throws MyException {
		System.out.println("Вызван compute(" + a + ")");
		if (a > 10) {
			throw new MyException(a);
		}
		System.out.println("Нормальное завершение");

	}

	public static void main(String[] args) {

		try {
			compute(10);
			compute(20);
		} catch (MyException e) {
			System.out.println("Перехвачено " + e);
		}
	}

}
