/**
 * 
 */
package part5ControlStatements;

/**
 * Использования цикла for в стиле for-each
 * 
 * @author Shiltd
 *
 */
public class ForEach {

	/**
	 * @param args перебор массива, а также суммирование всех элементов
	 */
	public static void main(String[] args) {

		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;

		for (int x : nums) {
			System.out.println("Значение равно: " + x);
			sum += x;
		}
		System.out.println("Сумма равна: " + sum);
	}

}
