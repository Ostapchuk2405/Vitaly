/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.*;

/**
 * Демонстрация применения GregorianCalendar
 * 
 * @author Schiltd
 *
 */
class GregorianCalendarDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String months[] = { 
				"Янв", "Фев", "Мар", "Апр",
				"Май", "Июн", "Июл", "Авг",
				"Сен", "Окт", "Ноя", "Дек" 
				};
		int year;

//		создать Григорианский календарь, инициализированный текущеё датой и временем 
//		с региональными данными и часовым поясом по умолчанию
		GregorianCalendar gCalendar = new GregorianCalendar();

//		отобразить текущее время и дату
		System.out.print("Дата: ");
		System.out.print(months[gCalendar.get(Calendar.MONTH)]);
		System.out.print(" " + gCalendar.get(Calendar.DATE) + " ");
		System.out.println(year = gCalendar.get(Calendar.YEAR));

		System.out.print("Время: ");
		System.out.print(gCalendar.get(Calendar.HOUR) + ":");
		System.out.print(gCalendar.get(Calendar.MINUTE) + ":");
		System.out.println(gCalendar.get(Calendar.SECOND));
		System.out.println();

//		проверить - высокосный ли год
		if (gCalendar.isLeapYear(year))
			System.out.println("Текущий год высокосный.");
		else
			System.out.println("Текущий год не высокосный.");

	}

}
