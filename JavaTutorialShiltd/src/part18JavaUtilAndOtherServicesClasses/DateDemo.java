/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.Date;

/**
 * ���������� ������ ����� � ����, ��������� ������ ������ ������ Date
 * 
 * @author Schiltd
 *
 */
class DateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		������� ������ Date
		Date date = new Date();

//		���������� ���� � ����� � ������� toString()
		System.out.println(date);

//		���������� ���������� �����������, ��������� � 1 ������ 1970�. �� GMT
		long msec = date.getTime();
		System.out.println("\n�����������, ��������� � 1 ������ 1970�. �� GMT = " + msec);
	}

}
