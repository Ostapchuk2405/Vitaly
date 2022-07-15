/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.io.*;
import java.util.Scanner;

/**
 * ���������� Scanner ��� ���������� �������� � ������ ���������� ��������
 * ��������
 * 
 * @author Schiltd
 *
 */
class SetDelimiters {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		int count = 0;
		double sum = 0.0;

//		������ ����� � ����
		FileWriter fout = new FileWriter("resources\\part18\\SetDelimiters.txt");

//		������ �������� �������� � ������, ���������� ��������
		fout.write("2, 3,4, 5,6, 7,4, 9,1, 10,5, ������");
		fout.close();

		FileReader fin = new FileReader("resources\\part18\\SetDelimiters.txt");
		Scanner src = new Scanner(fin);

//		���������� � �������� ������������ ������� � �������
		src.useDelimiter(", *");

//		������ � ����������� ��������
		while (src.hasNext()) {
			if (src.hasNextDouble()) {
				sum += src.nextDouble();
				count++;
			} else {
				String str = src.next();
				if (str.equals("������"))
					break;
				else {
					System.out.println("������ ������� ������.");
					return;
				}
			}

		}
		src.close();
		System.out.println("������� �����  " + sum / count);
	}

}
