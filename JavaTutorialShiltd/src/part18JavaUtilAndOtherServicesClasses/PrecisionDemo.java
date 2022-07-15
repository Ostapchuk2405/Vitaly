/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.Formatter;

/**
 * Демонстрация применения модификатора точности
 * 
 * @author Schiltd
 *
 */
class PrecisionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Formatter fmt = new Formatter();

//		формат с 4 десятичными разрядами
		fmt.format("%.4f", 123.1234567);
		System.out.println(fmt);
		fmt.close();

//		формат с 2 десятичными разрядами в 16-символьном поле
		fmt = new Formatter();
		fmt.format("%16.2e", 123.1234567);
		System.out.println(fmt);
		fmt.close();

//		отобразить максимум 15 символов строки
		fmt = new Formatter();
		fmt.format("%.15s", "Форматировать в Java теперь очень просто.");
		System.out.println(fmt);
		fmt.close();
	}

}
