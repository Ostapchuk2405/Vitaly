/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.*;

/**
 * очень простой пример применения Formatter
 * 
 * @author Schiltd
 *
 */
class FormatDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Formatter fmt = new Formatter();

		fmt.format("Форматирование %s просто %d %f", "с Java", 10, 98.6);

		System.out.println(fmt);
		fmt.close();
	}

}
