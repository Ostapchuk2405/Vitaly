/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.Formatter;

/**
 * ������������� ��������������� �\���������� ��������� � Formatter
 * 
 * @author Schiltd
 *
 */
class FormatDemo7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try(Formatter fmt = new Formatter()	){
			fmt.format("�������������� %s ������ %d %f", " � Java", 10, 98.6);
			System.out.println(fmt);
		}
	}

}
