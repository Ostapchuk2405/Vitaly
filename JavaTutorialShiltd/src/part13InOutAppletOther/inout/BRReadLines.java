/**
 * 
 */
package part13InOutAppletOther.inout;

/**
 * ������ ����� � ������� � ����������� BufferReader
 * 
 * @author Shiltd
 *
 */

import java.io.*;

class BRReadLines {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

//		������� BufferReader � ��������������  System.in

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;

		System.out.println("������� ������ ������.");
		System.out.println("������� '����' ��� ����������.");

		do {
			str = br.readLine();
			System.out.println(str);
		} while (!str.equalsIgnoreCase("����"));
	}

}
