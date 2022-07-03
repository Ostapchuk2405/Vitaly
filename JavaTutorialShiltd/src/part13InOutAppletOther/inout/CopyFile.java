/**
 * 
 */
package part13InOutAppletOther.inout;

import java.io.*;

/**
 * Копирование файла. Для использования этой программы укажите имена исходного и
 * целевого файла. Например, чтобы скопировать файл FIRST.txt в файл SECOND.txt,
 * используйте следующую командную строку:
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

//		Сначала убедимся, что указаны имена обоих файлов.
		if (args.length != 2) {
			System.out.println("Использование: CopyFile Файл");
			return;
		}

//		копирование файла
		try {
//			Попытка открыть файл
			fin = new FileInputStream(args[0]);
			fout = new FileOutputStream(args[1]);

			do {
				i = fin.read();
				if (i != -1)
					fout.write(i);
			} while (i != -1);
		} catch (IOException e) {
			System.out.println("Ошибка I/O: " + e);
		} finally {
			try {
				if (fin != null)
					fin.close();
			} catch (IOException e2) {
				System.out.println("Ошибка закрытия файла ввода.");
			}
			try {
				if (fout != null)
					fout.close();
			} catch (IOException e2) {
				System.out.println("Ошибка закрытия файла вывода.");
			}
		}
	}

}
