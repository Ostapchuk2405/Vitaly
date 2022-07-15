/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.Formatter;

/**
 * Демонстрация выравнивания влево
 * 
 * @author Schiltd
 *
 */
class LeftJustify {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Formatter fmt = new Formatter();

//		по умолчанию выравнивается вправо
		fmt.format("|%10.2f|", 123.123);
		System.out.println(fmt);
		fmt.close();

//		а теперь влево
		fmt = new Formatter();
		fmt.format("|%-10.2f|", 123.123);
		System.out.println(fmt);
		fmt.close();
	}

}
