/**
 * 
 */
package part4Operatos;

/**
 * ѕрименение сдвига влево в качестве быстрого умножени€ на 2
 * 
 * @author Shiltd
 *
 */
public class MultByTwo {

	/**
	 * @param args результаты после сдвига
	 */
	public static void main(String[] args) {

		int i;
		int num = 0xFFFFFFE;

		for (i = 0; i < 4; i++) {
			num = num << 1;
			System.out.println(num);
		}
	}

}
