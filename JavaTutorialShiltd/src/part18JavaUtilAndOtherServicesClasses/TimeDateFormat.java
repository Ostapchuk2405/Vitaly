/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.*;

/**
 * Форматирование времени и даты
 * 
 * @author Schiltd
 *
 */
class TimeDateFormat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Formatter fmt = new Formatter();
		Calendar cal = Calendar.getInstance();

//		отобразить стандартный 12-часовой формат
		fmt.format("%tR", cal);
		System.out.println(fmt);

//		отобразить полную информацию о дате и времени
		fmt = new Formatter();
		fmt.format("%tc", cal);
		System.out.println(fmt);

//		отобразить только сасы и минуты
		fmt = new Formatter();
		fmt.format("%tl:%tm", cal, cal);
		System.out.println(fmt);

//		отобразить название и номер месяца
		fmt = new Formatter();
		fmt.format("%tB %tb %tm", cal, cal, cal);
		System.out.println(fmt);
		fmt.close();
	}

}
