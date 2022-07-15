/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.*;

/**
 * ���������� Scanner ��� ���������� �������� �� ������ ��������
 * 
 * @author Schiltd
 *
 */
class AvgNums {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner conin = new Scanner(System.in);

		int count = 0;
		double sum = 0.0;

		System.out.println("������� ����� ��� �������� ��������:");

//		������ � ����������� ��������
		while (conin.hasNext()) {
			if (conin.hasNextDouble()) {
				sum += conin.nextDouble();
				count++;
			} else {
				String str = conin.next();
				if (str.equals("������"))
					break;
				else {
					System.out.println("������ ������� ������.");
					return;
				}
			}

		}
		conin.close();
		System.out.println("������� �����  " + sum / count);
	}

}
