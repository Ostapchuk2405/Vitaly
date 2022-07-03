/**
 * 
 */
package part5ControlStatements;

/**
 * Поис в массиве с применением цикла for-each
 * 
 * @author Shiltd
 *
 */
public class Search {

	/**
	 * @param args Значение найдено выведет,если оно будет в массиве
	 */
	public static void main(String[] args) {

		int nums[] = { 6, 8, 3, 7, 5, 6, 1, 4 };
		int val = 5;
		boolean found = false;

		for (int x : nums) {
			if (x == val) {
				found = true;
				break;
			}
		}
		if (found)
			System.out.println("Значение найдено!");
	}

}
