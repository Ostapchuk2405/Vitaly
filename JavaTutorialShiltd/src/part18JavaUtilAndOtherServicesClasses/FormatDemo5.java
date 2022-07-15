/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.Formatter;

/**
 * Демонстрация применения пробела в качестве спецификатора формата
 * 
 * @author Schiltd
 *
 */
class FormatDemo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Formatter fmt = new Formatter();

		fmt.format("% d", -100);
		System.out.println(fmt);
		fmt.close();

		fmt = new Formatter();
		fmt.format("% d", 100);
		System.out.println(fmt);
		fmt.close();

		fmt = new Formatter();
		fmt.format("% d", -200);
		System.out.println(fmt);
		fmt.close();

		fmt = new Formatter();
		fmt.format("% d", 200);
		System.out.println(fmt);
		fmt.close();
	}

}
