/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.*;

/**
 * ������������� ������������� �������� ��� ��������� �������� �����������������
 * ������� ���� � �������
 * 
 * @author Schiltd
 *
 */
class FormatDemo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Formatter fmt = new Formatter();

		Calendar cal = Calendar.getInstance();

		fmt.format("Today is the %te of %<tB, %<tY", cal);
		System.out.println(fmt);
		fmt.close();

	}

}
