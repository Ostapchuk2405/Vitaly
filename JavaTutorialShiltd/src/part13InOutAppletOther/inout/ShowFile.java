/**
 * 
 */
package part13InOutAppletOther.inout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Отображение текстового файла. Чтобы использовать эту программу, укажи имя
 * файла, который надо просматреть. Нопример, чтобы посмотреть TEST.txt,
 * используюй комманду:
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

//		Сначала убедимся, что имя файла указано правильно
		if (args.length != 1) {
			System.out.println("Использование: ShowFile Файл");
			return;
		}

//		попытка открыть файл
		try {
			fin = new FileInputStream(args[0]);
		} catch (FileNotFoundException e) {
			System.out.println("Не могу открыть файл");
			return;
		}

//		теперь файл открыт и готов к чтению
//		следующий код читает символы, пока не встретится EOF
		try {
			do {
				i = fin.read();
				if (i != -1)
					System.out.print((char) i);
			} while (i != -1);
		} catch (IOException e) {
			System.out.println("Ошибка чтения файла");
		}

//		закрыть файл
		try {
			fin.close();
		} catch (IOException e) {
			System.out.println("Ошибка закрытия файла.");
		}
	}

}
