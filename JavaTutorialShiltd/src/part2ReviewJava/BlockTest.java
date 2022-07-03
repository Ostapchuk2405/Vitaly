/**
 * 
 */
package part2ReviewJava;

/**
 * Демонстрирует цикл for сгруппированный в блок
 * 
 * @author Shildt
 * @return Value x and y
 *
 */
public class BlockTest {

	/**
	 * @param x Целочисленная переменная
	 * @param y Целочисленная переменная
	 * 
	 */
	public static void main(String[] args) {

		int x, y;

		y = 20;

//		Целевой модуль этого цикла - блок
		for (x = 0; x < 10; x++) {
			System.out.println("Значение x: " + x);
			System.out.println("Значение y: " + y);
			y = y - 2;
		}
	}

}
