/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.Calendar;

/**
 * ������������ ���������� Calendar
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

//		������� ���������, ������������������ ������� ����� � �������� 
//		� ������������� ������� � ������� ������ �� ���������
		Calendar calendar = Calendar.getInstance();

//		���������� ������� ����� � ����
		System.out.print("����: ");
		System.out.print(months[calendar.get(Calendar.MONTH)]);
		System.out.print(" " + calendar.get(Calendar.DATE));
		System.out.println(" " + calendar.get(Calendar.YEAR));
		System.out.print("\n�����: ");
		System.out.print(calendar.get(Calendar.HOUR) + ":");
		System.out.print(calendar.get(Calendar.MINUTE) + ":");
		System.out.println(calendar.get(Calendar.SECOND));

//		���������� ���������� ���� � ������� � ���������� �
		calendar.set(Calendar.HOUR, 10);
		calendar.set(Calendar.MINUTE, 29);
		calendar.set(Calendar.SECOND, 22);

		System.out.print("\n��������� �����: ");
		System.out.print(calendar.get(Calendar.HOUR) + ":");
		System.out.print(calendar.get(Calendar.MINUTE) + ":");
		System.out.println(calendar.get(Calendar.SECOND));
	}

}
