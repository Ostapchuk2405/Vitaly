/**
 * 
 */
package part7ClassesAndMethodsMore;

/**
 * Демонстрация некоторых методов класса String
 * 
 * @author Shiltd
 *
 */
class StringDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String strOb1 = "Первая строка";
		String strOb2 = "Вторая строка";
		String strOb3 = strOb1;

		System.out.println("Длинна strOb1: " + strOb1.length());
		System.out.println("Символ с индексом 3 в strOb1: " + strOb1.charAt(3));

		if (strOb1.equals(strOb2))
			System.out.println("strOb1 == strOb2");
		else
			System.out.println("strOb1 != strOb2");

		if (strOb1.equals(strOb3))
			System.out.println("strOb1 == strOb3");
		else
			System.out.println("strOb1 != strOb3");
	}

}
