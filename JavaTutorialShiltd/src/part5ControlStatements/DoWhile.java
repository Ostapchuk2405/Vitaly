/**
 * 
 */
package part5ControlStatements;

/**
 * Демонстрация использования цикла do-while
 * 
 * @author Shiltd
 *
 */
public class DoWhile {

	/**
	 * @param args тот же такт как и в class while
	 */
	public static void main(String[] args) {

		int n = 10;

		do {
			System.out.println("такт " + n);
			n--;
		} while (n > 0);

//		или такой вариант
//		do {
//			System.out.println("такт " + n);
//		} while (--n > 0);
	}

}
