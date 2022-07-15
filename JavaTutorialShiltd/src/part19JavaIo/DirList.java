/**
 * 
 */
package part19JavaIo;

import java.io.File;

/**
 * ������������� ���������.
 * 
 * @author Schiltd
 *
 */
class DirList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String dirName = "/resources";
		File f1 = new File(dirName);
		if (f1.isDirectory()) {
			System.out.println("�������: " + dirName);
			String s[] = f1.list();

			for (int i = 0; i < s.length; i++) {
				File f = new File(dirName + "/" + s[i]);
				if (f.isDirectory()) {
					System.out.println(s[i] + " �������� ���������.");
				} else {
					System.out.println(s[i] + " �������� ������.");
				}
			}
		} else {
			System.out.println(dirName + " is not directory.");
		}
	}

}
