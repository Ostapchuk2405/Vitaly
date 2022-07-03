/**
 * 
 */
package part5ControlStatements;

/**
 * Использования строки для контроля оператора
 * 
 * @author Shiltd
 *
 */
public class StringSwitch {

	/**
	 * @param args результат подходящий по свитчу
	 */
	public static void main(String[] args) {

		String str = "два";
		switch (str) {
		case "один":
			System.out.println("один");
			break;
		case "два":
			System.out.println("два");
			break;
		case "три":
			System.out.println("три");
			break;
		default:
			System.out.println("нет соответствия");
		}
	}

}
