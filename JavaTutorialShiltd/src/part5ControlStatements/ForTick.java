/**
 * 
 */
package part5ControlStatements;

/**
 * ƒемонстраци€ использовани€ цикла for.
 * @author Shiltd
 *
 */
public class ForTick {

	/**
	 * @param args вывод тактов
	 */
	public static void main(String[] args) {

		int n;
		
		for(n = 10; n > 0; n--)
			System.out.println("такт " + n);
		
//		или можно объ€вить внутри цикла
//		for(int n = 10; n < 10; n--)
//			System.out.println("такт " + n);
	}

}
