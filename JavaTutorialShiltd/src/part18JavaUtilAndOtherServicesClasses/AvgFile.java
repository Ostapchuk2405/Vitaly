/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.io.*;
import java.util.Scanner;

/**
 * ������������� Scanner ��� ���������� �������� �������� ����� �����
 * 
 * @author Schiltd
 *
 */
class AvgFile {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		int count = 0;
		double sum = 0.0;

//		�������� �����  � ����
		FileWriter fout = new FileWriter("resources\\part18\\AvgFile.txt");
		fout.write("2 3,4 5 6 7,4 9,1 10,5 ������");
		fout.close();

		FileReader fin = new FileReader("resources\\part18\\AvgFile.txt");
		Scanner conin = new Scanner(fin);

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
