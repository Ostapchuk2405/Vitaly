/**
 * 
 */
package part5ControlStatements;

/**
 * Использования оператора break для выхода из цикла while
 * 
 * @author Shiltd
 *
 */
public class BreakLoop2 {

	/**
	 * @param args циклы массива
	 */
	public static void main(String[] args) {

		int i = 0;

		while (i < 100) {
			if (i == 10)
				break;
			System.out.println("i: " + i);
			i++;
		}
		System.out.println("Цикл завершён.");
	}

}
