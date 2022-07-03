/**
 * 
 */
package part13InOutAppletOther.inout;

/**
 * ��� ������ ��������� ���������� �������� try-�-���������, ����� �������������
 * ������� ����(������� � JDK7)
 * 
 * @author Shiltd
 *
 */

import java.io.*;

class ShowFile3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int i;

//		���������, ��� ��� ����� ������� ���������
		if (args.length != 1) {
			System.out.println("�������������: ShowFile3 fileName");
			return;
		}

//		��������� ��� ���������� �������� try-�-���������, ����� ������� ����, � ����� ������������� ������� ���
		try (FileInputStream fin = new FileInputStream(args[0])) {

			do {
				i = fin.read();
				if (i != -1)
					System.out.print((char) i);
			} while (i != -1);
		} catch (FileNotFoundException e) {
			System.out.println("���� �� ������.");
		} catch (IOException e) {
			System.out.println("��������� ������ I/O/");
		}
	}

}
