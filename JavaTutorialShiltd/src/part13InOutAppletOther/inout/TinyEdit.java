/**
 * 
 */
package part13InOutAppletOther.inout;

/**
 * ��������� ��������
 * @author Shiltd
 *
 */

import java.io.*;

class TinyEdit {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = new String[100];
		System.out.println("������� ������ ������: ");
		System.out.println("������� '����' ��� ����������.");
		for (int i = 0; i < 100; i++) {
			str[i] = br.readLine();
			if (str[i].equalsIgnoreCase("����"))
				break;
		}

		System.out.println("\n��� ��� ����:");

//		���������� ������
		for (int i = 0; i < 100; i++) {
			if (str[i].equalsIgnoreCase("����"))
				break;
			System.out.println(str[i]);
		}
	}

}
