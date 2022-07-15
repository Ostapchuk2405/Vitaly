/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.Calendar;

/**
 * Демонстрация применения Calendar
 * 
 * @author Schiltd
 *
 */
class CalendarDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String months[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Ayg", "Sep", "Oct", "Nov", "Dec" };

//		создать календарь, инициализированный текущей датой и временем 
//		с региональными данными и часовым поясом по умолчанию
		Calendar calendar = Calendar.getInstance();

//		отобразить текущее время и дату
		System.out.print("Дата: ");
		System.out.print(months[calendar.get(Calendar.MONTH)]);
		System.out.print(" " + calendar.get(Calendar.DATE));
		System.out.println(" " + calendar.get(Calendar.YEAR));
		System.out.print("\nВремя: ");
		System.out.print(calendar.get(Calendar.HOUR) + ":");
		System.out.print(calendar.get(Calendar.MINUTE) + ":");
		System.out.println(calendar.get(Calendar.SECOND));

//		установить информацию даты и времени и отобразить её
		calendar.set(Calendar.HOUR, 10);
		calendar.set(Calendar.MINUTE, 29);
		calendar.set(Calendar.SECOND, 22);

		System.out.print("\nИзменённое время: ");
		System.out.print(calendar.get(Calendar.HOUR) + ":");
		System.out.print(calendar.get(Calendar.MINUTE) + ":");
		System.out.println(calendar.get(Calendar.SECOND));
	}

}
