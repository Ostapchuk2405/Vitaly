/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.*;

/**
 * ������������ ���������� Currency
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

		System.out.println("������: " + c.getSymbol());
		System.out.println("���������� ������� �������� �� ���������: " + c.getDefaultFractionDigits());
	}

}
