/**
 * 
 */
package part5ControlStatements;

/**
 * Использование оператора break в качестве цивилизованной формы оператора goto.
 * 
 * @author Shiltd
 *
 */
public class Break {

	/**
	 * @param args операторы, которые могут выполнятся
	 */
	public static void main(String[] args) {

		boolean t = true;

		first: {
			second: {
				third: {
					System.out.println("Предшествует оператору break.");
					if (t)
						break second; // выход из блока second
					System.out.println("Этот оператор не будет выполняться");
				}
				System.out.println("Этот оператор не будет выполнятся");
			}
			System.out.println("Этот оператор следует за блоком second.");
		}
	}

}
