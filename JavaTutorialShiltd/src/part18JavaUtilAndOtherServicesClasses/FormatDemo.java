/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.*;

/**
 * ����� ������� ������ ���������� Formatter
 * 
 * @author Schiltd
 *
 */
class FormatDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Formatter fmt = new Formatter();

		fmt.format("�������������� %s ������ %d %f", "� Java", 10, 98.6);

		System.out.println(fmt);
		fmt.close();
	}

}
