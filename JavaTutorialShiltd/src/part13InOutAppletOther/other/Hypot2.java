/**
 * 
 */
package part13InOutAppletOther.other;

/**
 * Применение стотического импорта, делающего sqrt() и pow() видимым.
 * Второй вариант вычисления гипотенузы.
 * @author Shiltd
 *
 */

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

class Hypot2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double side1, side2;
		double hypot;

		side1 = 3.0;
		side2 = 4.0;

		hypot = sqrt(pow(side1, 2) + pow(side2, 2));

		System.out.println("Даны длины сторон " + side1 + " и " + side2 + ", гиротенуза равна " + hypot + ".");
	}

}
