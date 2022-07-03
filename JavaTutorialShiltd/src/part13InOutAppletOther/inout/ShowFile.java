/**
 * 
 */
package part13InOutAppletOther.inout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ����������� ���������� �����. ����� ������������ ��� ���������, ����� ���
 * �����, ������� ���� �����������. ��������, ����� ���������� TEST.txt,
 * ���������� ��������:
 * 
 * java ShowFile TEST.txt
 * 
 * @author Shiltd
 *
 */
class ShowFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int i;
		FileInputStream fin;

//		������� ��������, ��� ��� ����� ������� ���������
		if (args.length != 1) {
			System.out.println("�������������: ShowFile ����");
			return;
		}

//		������� ������� ����
		try {
			fin = new FileInputStream(args[0]);
		} catch (FileNotFoundException e) {
			System.out.println("�� ���� ������� ����");
			return;
		}

//		������ ���� ������ � ����� � ������
//		��������� ��� ������ �������, ���� �� ���������� EOF
		try {
			do {
				i = fin.read();
				if (i != -1)
					System.out.print((char) i);
			} while (i != -1);
		} catch (IOException e) {
			System.out.println("������ ������ �����");
		}

//		������� ����
		try {
			fin.close();
		} catch (IOException e) {
			System.out.println("������ �������� �����.");
		}
	}

}
