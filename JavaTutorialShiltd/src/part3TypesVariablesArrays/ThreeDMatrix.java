/**
 * 
 */
package part3TypesVariablesArrays;

/**
 * Демонстрация трёхмерного массива
 * 
 * @author Shiltd
 *
 */
public class ThreeDMatrix {

	/**
	 * @param args выводит все элементы данного массива
	 */
	public static void main(String[] args) {

		int threeD[][][] = new int[3][4][5];
		int i, j, k;

		for (i = 0; i < 3; i++)
			for (j = 0; j < 4; j++)
				for (k = 0; k < 5; k++)
					threeD[i][j][k] = i * j * k;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				for (k = 0; k < 5; k++)
					if (threeD[i][j][k] < 10) {
						System.out.print(threeD[i][j][k] + "   ");
					} else {
						System.out.print(threeD[i][j][k] + "  ");
					}
				System.out.println();
			}
			System.out.println();
		}

	}
}