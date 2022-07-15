/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.*;

/**
 * 
 * Демонстрация применения спецификатора ширины поля
 * 
 * @author Schiltd
 *
 */
class FormatDemo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Formatter fmt = new Formatter();

		fmt.format("|%f|%n|%12f|%n|%012f|", 10.12345, 10.12345, 10.12345);
		System.out.println(fmt);
		fmt.close();
	}

}
