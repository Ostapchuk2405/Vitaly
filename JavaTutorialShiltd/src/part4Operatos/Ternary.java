/**
 * 
 */
package part4Operatos;

/**
 * Демонстрация использования оператора ?.
 * 
 * @author Shiltd
 *
 */
public class Ternary {

	/**
	 * @param args абсолютное значение i
	 */
	public static void main(String[] args) {

		int i, k;

		i = 10;
		k = i < 0 ? -i : i;
		System.out.println("Абсолютное значение " + i + " = " + k);

		i = -10;
		k = i < 0 ? -i : i;
		System.out.println("Абсолютное значение " + i + " = " + k);
	}

}
