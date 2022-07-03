/**
 * 
 */
package part7ClassesAndMethodsMore;

/**
 * »спользовани€ массива дл€ передачи методу переменного количества аргументов
 * 
 * @author Shiltd
 *
 */
class PassArray {

	/**
	 * @param args
	 */

	static void vaTest(int v[]) {
		System.out.print(" оличество аргументов: " + v.length + "—одержимое: ");

		for (int x : v)
			System.out.print(x + " ");
		System.out.println();
	}

	public static void main(String[] args) {

		int n1[] = { 10 };
		int n2[] = { 1, 2, 3 };
		int n3[] = {};

		vaTest(n1);
		vaTest(n2);
		vaTest(n3);
	}

}
