/**
 * 
 */
package part16JavaLang;

import java.io.*;

/**
 * ��� ��������� ��������� ������ ����� �����, �������� �������������. ���
 * ����������� ��������� ������������� ������� ����� � �����, ���������
 * pareseInt()
 * 
 * @author Shiltd
 *
 */
class ParseDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

//		������� BufferedReader, ��������� System.in
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int i;
		int sum = 0;
		System.out.println("������� �����, 0 - ��� ������.");
		do {
			str = br.readLine();
			try {
				i = Integer.parseInt(str);
			} catch (NumberFormatException e) {
				System.out.println("�������� ������");
				i = 0;
			}
			sum += i;
			System.out.println("������� �����: " + sum);
		} while (i != 0);
	}

}
