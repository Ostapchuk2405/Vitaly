/**
 * 
 */
package part5ControlStatements;

/**
 * Использование оператора break для выхода из цикла
 * 
 * @author Shiltd
 *
 */
public class BreakLoop {

	/**
	 * @param args циклы 
	 */
	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			if (i == 10)
				break;
			System.out.println("i = " + i);
		}
		System.out.println("Цикл завершился.");
	}

}
