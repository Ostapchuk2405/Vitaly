/**
 * 
 */
package part16JavaLang;

/**
 * Демонстрация применения toDegrees() & toRadians()
 * 
 * @author Shiltd
 *
 */
class Angles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double theta = 120.0;
		System.out.println(theta + " градусов равно " + Math.toRadians(theta) + " " + " радиан.");

		theta = 1.312;
		System.out.println(theta + " радиан равно " + Math.toDegrees(theta) + " градусов.");
	}

}
