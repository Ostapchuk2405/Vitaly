/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.Formatter;

/**
 * Использование автоматического к\управления ресурсами с Formatter
 * 
 * @author Schiltd
 *
 */
class FormatDemo7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try(Formatter fmt = new Formatter()	){
			fmt.format("Форматирование %s просто %d %f", " с Java", 10, 98.6);
			System.out.println(fmt);
		}
	}

}
