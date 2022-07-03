/**
 * 
 */
package part13InOutAppletOther.inout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Этот вариант заключает код, который открывает и получает доступ к файлу, в
 * один блок try. Файл закрывается в блоке finally.
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
			System.out.println("Использование: ShowFile Файл");
			return;
		}

//		следующий код открывает файл, читает символы, пока не встретится EOF, а затем  закрывает файл в блоке finally
		try {
			fin = new FileInputStream(args[0]);

			do {
				i = fin.read();
				if (i != -1)
					System.out.print((char) i);
			} while (i != -1);
		} catch (FileNotFoundException e) {
			System.out.println("Файл не найден.");
		} catch (IOException e) {
			System.out.println("Произошла ошибка I/O");
		} finally {
//			закрыть файл в любом случае
			try {
				if (fin != null)
					fin.close();
			} catch (IOException e2) {
				System.out.println("Ошибка закрытия файла.");
			}
		}
	}

}
