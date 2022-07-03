/**
 * 
 */
package part13InOutAppletOther.inout;

import java.io.*;

/**
 * ����������� �����. ��� ������������� ���� ��������� ������� ����� ��������� �
 * �������� �����. ��������, ����� ����������� ���� FIRST.txt � ���� SECOND.txt,
 * ����������� ��������� ��������� ������:
 * 
 * java CopyFile FIRST.txt SECOND.txt
 * 
 * @author Shiltd
 *
 */
class CopyFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

		int i;
		FileInputStream fin = null;
		FileOutputStream fout = null;

//		������� ��������, ��� ������� ����� ����� ������.
		if (args.length != 2) {
			System.out.println("�������������: CopyFile ����");
			return;
		}

//		����������� �����
		try {
//			������� ������� ����
			fin = new FileInputStream(args[0]);
			fout = new FileOutputStream(args[1]);

			do {
				i = fin.read();
				if (i != -1)
					fout.write(i);
			} while (i != -1);
		} catch (IOException e) {
			System.out.println("������ I/O: " + e);
		} finally {
			try {
				if (fin != null)
					fin.close();
			} catch (IOException e2) {
				System.out.println("������ �������� ����� �����.");
			}
			try {
				if (fout != null)
					fout.close();
			} catch (IOException e2) {
				System.out.println("������ �������� ����� ������.");
			}
		}
	}

}
