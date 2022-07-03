/**
 * 
 */
package part15StringProcessing;

/**
 * Демонстрация toUpperCase() & toLowerCase()
 * 
 * @author Shiltd
 *
 */
class ChangeCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s = "Это тест";
		System.out.println("Тсходная строка: " + s);
		String upper = s.toUpperCase();
		String lower = s.toLowerCase();
		System.out.println("Верхний регистр: " + upper);
		System.out.println("Нижний регистр: " + lower);
	}

}
