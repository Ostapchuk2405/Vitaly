/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.*;

/**
 * �������������� ������� � ����
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

//		���������� ����������� 12-������� ������
		fmt.format("%tR", cal);
		System.out.println(fmt);

//		���������� ������ ���������� � ���� � �������
		fmt = new Formatter();
		fmt.format("%tc", cal);
		System.out.println(fmt);

//		���������� ������ ���� � ������
		fmt = new Formatter();
		fmt.format("%tl:%tm", cal, cal);
		System.out.println(fmt);

//		���������� �������� � ����� ������
		fmt = new Formatter();
		fmt.format("%tB %tb %tm", cal, cal, cal);
		System.out.println(fmt);
		fmt.close();
	}

}
