/**
 * 
 */
package part7ClassesAndMethodsMore;

/**
 * Демонстрация использования массивов объектов типа String.
 * 
 * @author Shiltd
 *
 */
class StringDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str[] = { "один", "два", "три" };

		for (int i = 0; i < str.length; i++)
			System.out.println("str[" + i + "]: " + str[i]);
	}

}
