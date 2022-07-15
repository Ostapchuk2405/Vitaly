/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.*;

/**
 * Демонстрация применения Currency
 * 
 * @author Schiltd
 *
 */
class CurrencyDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Currency c;

		c = Currency.getInstance(Locale.US);

		System.out.println("Символ: " + c.getSymbol());
		System.out.println("Количество дробных разрядов по умолчанию: " + c.getDefaultFractionDigits());
	}

}
