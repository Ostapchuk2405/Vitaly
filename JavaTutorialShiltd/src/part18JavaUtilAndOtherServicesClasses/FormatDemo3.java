/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.Formatter;

/**
 * ������������ ���������� �������������� ������� %n %%
 * 
 * @author Schiltd
 *
 */
class FormatDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Formatter fmt = new Formatter();

		fmt.format("����������� �����%n����������� �� %d%% ���������.", 88);
		System.out.println(fmt);
		fmt.close();
	}

}
