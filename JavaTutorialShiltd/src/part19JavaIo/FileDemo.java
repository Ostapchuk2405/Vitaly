/**
 * 
 */
package part19JavaIo;

import java.io.File;

/**
 * ������������ ������ � File.
 * 
 * @author Schiltd
 *
 */
class FileDemo {

	static void p(String s) {
		System.out.println(s);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		File f1 = new File("resources\\part19\\COPYRIGHT");
		p("��� �����: " + f1.getName());
		p("����: " + f1.getPath());
		p("���������� ����: " + f1.getAbsolutePath());
		p("������������ �������: " + f1.getParent());
		p(f1.exists() ? "����������" : "�� ����������");
		p(f1.canWrite() ? "�������� ��� ������" : "�� �������� ��� ������");
		p(f1.canRead() ? "�������� ��� ������" : "�� �������� ��� ������");
		p(f1.isDirectory() ? "�������� ���������" : "�� �������� ���������");
		p(f1.isFile() ? "�������� ������� ������" : "����� ���� ����������� �������");
		p(f1.isAbsolute() ? "�������� ����������" : "�� �������� ����������");
		p("����� �����������: " + f1.lastModified());
		p("������:  " + f1.length() + " ����.");
	}

}
