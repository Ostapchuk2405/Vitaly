/**
 * 
 */
package part13InOutAppletOther.other;

/**
 * Вычисляет длинну гипотенузы прямоугольного треугольника(Статический импорт)
 * 
 * @author Shiltd
 *
 */
class Hypot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double side1, side2;
		double hypot;

		side1 = 3.0;
		side2 = 4.0;

//		Внимание на то, что sqrt() & pow() должны быть квалифицированны именем их класса - Math.
		hypot = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

		System.out.println("Даны длины сторон " + side1 + " и " + side2 + ", гиротенуза равна " + hypot + ".");
	}

}
