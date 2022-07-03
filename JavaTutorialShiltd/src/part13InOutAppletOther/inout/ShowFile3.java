/**
 * 
 */
package part13InOutAppletOther.inout;

/**
 * Эта версия программы использует оператор try-с-ресурсами, чтобы автоматически
 * закрыть файл(начиная с JDK7)
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

//		Убедиться, что имя файла указано правильно
		if (args.length != 1) {
			System.out.println("Использование: ShowFile3 fileName");
			return;
		}

//		следующий код использует оператор try-с-ресурсами, чтобы открыть файл, а затем автоматически закрыть его
		try (FileInputStream fin = new FileInputStream(args[0])) {

			do {
				i = fin.read();
				if (i != -1)
					System.out.print((char) i);
			} while (i != -1);
		} catch (FileNotFoundException e) {
			System.out.println("Файл не найден.");
		} catch (IOException e) {
			System.out.println("Произошла ошибка I/O/");
		}
	}

}
