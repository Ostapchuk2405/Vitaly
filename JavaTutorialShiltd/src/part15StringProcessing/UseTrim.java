/**
 * 
 */
package part15StringProcessing;

import java.io.*;

/**
 * ������������� trim() ��� ��������� ������
 * 
 * @author Shiltd
 *
 */
class UseTrim {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

//		������ BufferedReader � �������������� System.in
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("������� '����' ��� ����������.");
		System.out.println("������� ����: ");

		do {
			str = br.readLine();
			str = str.trim();
			if (str.equals("��������"))
				System.out.println("������� - ����������.");
			else if (str.equals("�������"))
				System.out.println("������� - ����������-����.");
			else if (str.equals("����������"))
				System.out.println("������� - ����������.");
			else if (str.equals("���������"))
				System.out.println("������� - �������.");
			// ...
		} while (!str.equals("����"));
	}

}
