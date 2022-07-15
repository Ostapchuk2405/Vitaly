/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.io.*;

/**
 * Демонстрация применения FileOutputStream.
 * Можно и другой вариант с помощью оператора try-с-ресурсами.
 * 
 * @author Schiltd
 *
 */
class FileOutputStreamDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String sources = "Now is the time for all good men\n" + "to come to the aid of their country\n"
				+ "and pay their due taxes.";

		byte buf[] = sources.getBytes();
		FileOutputStream f0 = null;
		FileOutputStream f1 = null;
		FileOutputStream f2 = null;

		try {
			f0 = new FileOutputStream("resources\\part19\\file1.txt");
			f1 = new FileOutputStream("resources\\part19\\file2.txt");
			f2 = new FileOutputStream("resources\\part19\\file3.txt");

//			запись в первый файл
			for (int i = 0; i < buf.length; i += 2)
				f0.write(buf[i]);
//			запись во второй файл
			f1.write(buf);
//			запись в третий файл
			f2.write(buf, buf.length - buf.length / 4, buf.length / 4);
		} catch (IOException e) {
			System.out.println("An I/O Error Occured");
		} finally {
			try {
				if (f0 != null)
					f0.close();
			} catch (IOException e2) {
				System.out.println("Error closing file1.txt");
			}
			try {
				if (f1 != null)
					f1.close();
			} catch (IOException e2) {
				System.out.println("Error Closing file2.txt");
			}
			try {
				if (f2 != null)
					f2.close();
			} catch (IOException e2) {
				System.out.println("Error Closing file3.txt");
			}
		}
	}

}
