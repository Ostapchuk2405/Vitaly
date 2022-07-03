/**
 * 
 */
package part5ControlStatements;

/**
 * »спользование зап€той
 * 
 * @author Shiltd
 *
 */
public class Comma {

	/**
	 * @param args переменные мен€ющиес€ в цикле
	 */
	public static void main(String[] args) {

		int a, b;

		for (a = 1, b = 4; a < b; a++, b--) {
			System.out.println("a = " + a);
			System.out.println("b = " + b);
		}
	}

}
