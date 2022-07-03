/**
 * 
 */
package part13InOutAppletOther.inout;

/**
 * Эта версия использует оператор try-с-ресурсами.
 * Она демонстрирует управление двумя ресурсами в одном операторе try
 * 
 * 
 * @author Shiltd
 *
 */

import java.io.*;

class CopyFile2 {

	/**
	 * @param args
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {

		int i;

		if (args.length != 2) {
			System.out.println("Использование: CopyFile2 из в");
			return;
		}

		try (FileInputStream fin = new FileInputStream(args[0]);
				FileOutputStream fout = new FileOutputStream(args[1])) {
			do {
				i = fin.read();
				if (i != -1)
					fout.write(i);
			} while (i != -1);
		} catch (IOException e) {
			System.out.println("Ошибка I/O: " + e);
		}
	}

}
