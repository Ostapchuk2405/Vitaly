/**
 * 
 */
package part13InOutAppletOther.inout;

/**
 * ������������� BufferReader ��� ������ �������� � �������
 * 
 * @author Shiltd
 *
 */

import java.io.*;

class BRRead {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������� �������, 'q' - ��� ������.");

//		������ �������
		do {
			c = (char) br.read();
			System.out.println(c);
		} while (c != 'q');
	}

}
