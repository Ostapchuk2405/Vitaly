package part3TypesVariablesArrays;

/**
 * Вычисление площади круга
 * 
 * @author Shildt
 *
 * @return Площадь круга
 */

public class CircleArea {

	public static void main(String[] args) {

		double pi, r, area;

		r = 10.8;				// радиус окружности
		pi = 3.1416;			// пи, приблизительное значение
		area = pi * r * r;		// вычисление площади

		System.out.println("Площадь круга составляет " + area);
	}

}
