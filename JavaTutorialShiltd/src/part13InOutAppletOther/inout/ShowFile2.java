/**
 * 
 */
package part13InOutAppletOther.inout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ���� ������� ��������� ���, ������� ��������� � �������� ������ � �����, �
 * ���� ���� try. ���� ����������� � ����� finally.
 * 
 * @author Shiltd
 *
 */
class ShowFile2 {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		int i;
		FileInputStream fin = null;

		if (args.length != 1) {
			System.out.println("�������������: ShowFile ����");
			return;
		}

//		��������� ��� ��������� ����, ������ �������, ���� �� ���������� EOF, � �����  ��������� ���� � ����� finally
		try {
			fin = new FileInputStream(args[0]);

			do {
				i = fin.read();
				if (i != -1)
					System.out.print((char) i);
			} while (i != -1);
		} catch (FileNotFoundException e) {
			System.out.println("���� �� ������.");
		} catch (IOException e) {
			System.out.println("��������� ������ I/O");
		} finally {
//			������� ���� � ����� ������
			try {
				if (fin != null)
					fin.close();
			} catch (IOException e2) {
				System.out.println("������ �������� �����.");
			}
		}
	}

}
