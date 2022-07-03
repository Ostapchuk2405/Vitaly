/**
 * 
 */
package part13InOutAppletOther.inout;

/**
 * Крошечный редактор
 * @author Shiltd
 *
 */

import java.io.*;

class TinyEdit {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = new String[100];
		System.out.println("Вводите строки текста: ");
		System.out.println("Введите 'стоп' для завершения.");
		for (int i = 0; i < 100; i++) {
			str[i] = br.readLine();
			if (str[i].equalsIgnoreCase("стоп"))
				break;
		}

		System.out.println("\nВот Ваш файл:");

//		Отобразить строки
		for (int i = 0; i < 100; i++) {
			if (str[i].equalsIgnoreCase("стоп"))
				break;
			System.out.println(str[i]);
		}
	}

}
