/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.*;

/**
 * ������������ ���������� GregorianCalendar
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
				"���", "���", "���", "���",
				"���", "���", "���", "���",
				"���", "���", "���", "���" 
				};
		int year;

//		������� ������������� ���������, ������������������ ������ ����� � �������� 
//		� ������������� ������� � ������� ������ �� ���������
		GregorianCalendar gCalendar = new GregorianCalendar();

//		���������� ������� ����� � ����
		System.out.print("����: ");
		System.out.print(months[gCalendar.get(Calendar.MONTH)]);
		System.out.print(" " + gCalendar.get(Calendar.DATE) + " ");
		System.out.println(year = gCalendar.get(Calendar.YEAR));

		System.out.print("�����: ");
		System.out.print(gCalendar.get(Calendar.HOUR) + ":");
		System.out.print(gCalendar.get(Calendar.MINUTE) + ":");
		System.out.println(gCalendar.get(Calendar.SECOND));
		System.out.println();

//		��������� - ���������� �� ���
		if (gCalendar.isLeapYear(year))
			System.out.println("������� ��� ����������.");
		else
			System.out.println("������� ��� �� ����������.");

	}

}
