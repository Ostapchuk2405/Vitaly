/**
 * 
 */
package part7ClassesAndMethodsMore;

/**
 * Ещё один пример с рекурсией, который выведет элементы массива
 * 
 * @author Shiltd
 *
 */

class RecTest {
	int values[];

	public RecTest(int i) {
		values = new int[i];
	}

	void printAray(int i) {
		if (i == 0)
			return;
		else
			printAray(i - 1);
		System.out.println("[" + (i - 1) + "] " + values[i - 1]);
	}
}

 class Recursion2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		RecTest ob = new RecTest(10);
		int i;

		for (i = 0; i < 10; i++)
			ob.values[i] = i;

		ob.printAray(10);
	}

}
