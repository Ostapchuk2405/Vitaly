/**
 * 
 */
package part3TypesVariablesArrays;

/**
 * ������������ ����������� �������
 * 
 * @author Shiltd
 * @return �������� �������
 *
 */
public class TwoDArray {

	/**
	 * @param args ������������� � ��������� ��������� �������
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
