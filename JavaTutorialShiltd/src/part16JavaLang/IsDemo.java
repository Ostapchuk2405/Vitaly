/**
 * 
 */
package part16JavaLang;

/**
 * Демонстрация применения некоторых методов Is...
 * 
 * @author Shiltd
 *
 */
class IsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		char a[] = { 'a', 'b', '5', '?', 'A', ' ' };
		for (int i = 0; i < a.length; i++) {
			if (Character.isDigit(a[i]))
				System.out.println(a[i] + " - десятичное число.");
			if (Character.isLetter(a[i]))
				System.out.println(a[i] + " - буква.");
			if (Character.isWhitespace(a[i]))
				System.out.println(a[i] + " - пробельный символ.");
			if (Character.isUpperCase(a[i]))
				System.out.println(a[i] + " - символ верхнего регистра.");
			if (Character.isLowerCase(a[i]))
				System.out.println(a[i] + " - символ нижнего регистра.");
		}
	}

}
