/**
 * 
 */
package part16JavaLang;

/**
 * Преобразование целое в бинарный, шестнадцатеричный и восьмеричный формат
 * 
 * @author Shiltd
 *
 */
class StringConversions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num = 19648;

		System.out.println(num + " в бинарном формате: " + Integer.toBinaryString(num));
		System.out.println(num + " в восьмеричном формате: " + Integer.toOctalString(num));
		System.out.println(num + " в шестнадцатеричном формате: " + Integer.toHexString(num));
	}

}
