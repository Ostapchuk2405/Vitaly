/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.Formatter;

/**
 * ������������ ���������� ������������ ��������
 * 
 * @author Schiltd
 *
 */
class PrecisionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Formatter fmt = new Formatter();

//		������ � 4 ����������� ���������
		fmt.format("%.4f", 123.1234567);
		System.out.println(fmt);
		fmt.close();

//		������ � 2 ����������� ��������� � 16-���������� ����
		fmt = new Formatter();
		fmt.format("%16.2e", 123.1234567);
		System.out.println(fmt);
		fmt.close();

//		���������� �������� 15 �������� ������
		fmt = new Formatter();
		fmt.format("%.15s", "������������� � Java ������ ����� ������.");
		System.out.println(fmt);
		fmt.close();
	}

}
