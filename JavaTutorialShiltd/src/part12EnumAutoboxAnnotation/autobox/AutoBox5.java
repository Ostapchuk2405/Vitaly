/**
 * 
 */
package part12EnumAutoboxAnnotation.autobox;

/**
 * Автоупаковка и распаковка Boolean и Character
 * 
 * @author Shiltd
 *
 */
class AutoBox5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Boolean b = true;

		if (b) {
			System.out.println("b равна true");
		}

		Character ch = 'x';
		char ch2 = ch;

		System.out.println("ch2 равна " + ch2);
	}

}
