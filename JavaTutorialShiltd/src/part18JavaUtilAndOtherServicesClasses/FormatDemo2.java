/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.*;

/**
 * Демонстрирует применение спецификатора %g.
 * 
 * @author Schiltd
 *
 */
class FormatDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Formatter fmt = new Formatter();

		for (double i = 1000; i < 1.0e+10; i *= 100) {
			fmt.format("%g ", i);
			System.out.println(fmt);
		}
		fmt.close();
	}

}
