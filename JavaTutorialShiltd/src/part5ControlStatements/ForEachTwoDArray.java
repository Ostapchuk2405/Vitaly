/**
 * 
 */
package part5ControlStatements;

/**
 * Применение цикла for в стиле for-each применительно к двухмерному массиву
 * 
 * @author Shiltd
 *
 */
public class ForEachTwoDArray {

	/**
	 * @param args элементы массива и их сумма
	 */
	public static void main(String[] args) {

		int sum = 0;
		int nums[][] = new int[3][5];

//		присвоение значений элементам
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 5; j++)
				nums[i][j] = (i + 1) * (j + 1);

		for (int x[] : nums) {
			for (int y : x) {
				System.out.println("Значение равно: " + y);
				sum += y;
			}
		}
		System.out.println("Сумма: " + sum);
	}

}
