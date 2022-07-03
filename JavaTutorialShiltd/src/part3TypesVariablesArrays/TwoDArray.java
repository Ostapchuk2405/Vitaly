/**
 * 
 */
package part3TypesVariablesArrays;

/**
 * Демонстрация двухмерного массива
 * 
 * @author Shiltd
 * @return элементы массива
 *
 */
public class TwoDArray {

	/**
	 * @param args инициализация и выведение элементов массива
	 */
	public static void main(String[] args) {

		int twoD[][] = new int[4][5];
		int i, j, k = 0;

		for (i = 0; i < 4; i++)
			for (j = 0; j < 5; j++) {
				twoD[i][j] = k;
				k++;
			}
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 5; j++)
				if (twoD[i][j] >= 10) {
					System.out.print(twoD[i][j] + "   ");
				} else {
					System.out.print(twoD[i][j] + "    ");
				}
			System.out.println();
			System.out.println();
		}
	}
}
