/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.io.*;
import java.util.Scanner;

/**
 * ���������� Scanner ��� ������ ������ ������� ���� �� �����
 * 
 * @author Schiltd
 *
 */
class ScanMixed {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		int i;
		double d;
		boolean b;
		String str;

//		������ ����� � ����
		FileWriter fout = new FileWriter("resources\\part18\\ScanMixed.txt");
		fout.write("������������ Scanner 10 12.2 ���� true ��� false");
		fout.close();

		FileReader fin = new FileReader("resources\\part18\\ScanMixed.txt");
		Scanner sc = new Scanner(fin);

		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				System.out.println("int: " + i);
			} else if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				System.out.println("double: " + d);
			} else if (sc.hasNextBoolean()) {
				b = sc.nextBoolean();
				System.out.println("boolean: " + b);
			} else {
				str = sc.next();
				System.out.println("String: " + str);
			}
		}
		sc.close();
	}

}
