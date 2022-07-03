/**
 * 
 */
package part5ControlStatements;

/**
 * »спользование оператора break дл€ выхода из вложенных циклов
 * 
 * @author Shiltd
 *
 */
public class BreakLoop4 {

	/**
	 * @param args перебор переменной
	 */
	public static void main(String[] args) {

		outer: for (int i = 0; i < 3; i++) {
			System.out.print("ѕроход " + i + ": ");
			for (int j = 0; j < 100; j++) {
				if (j == 10)
					break outer;
				System.out.print(j + " ");
			}
			System.out.println("Ёта строка не будет выводитс€");
		}
		System.out.println("÷иклы завершены.");
	}

}
