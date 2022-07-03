/**
 * 
 */
package part5ControlStatements;

/**
 * Тспользования оператора break для выхода из вложенных циклов
 * 
 * @author Shiltd
 *
 */
public class BreakLoop3 {

	/**
	 * @param args циклы
	 */
	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			System.out.print("Проход " + i + ": ");
			for (int j = 0; j < 100; j++) {
				if (j == 10)
					break;
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("\nЦиклы завершены.");
	}

}
