/**
 * 
 */
package part13InOutAppletOther.inout;

/**
 * Чтение строк с консоли с применением BufferReader
 * 
 * @author Shiltd
 *
 */

import java.io.*;

class BRReadLines {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

//		Создать BufferReader с использованием  System.in

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;

		System.out.println("Вводите строки текста.");
		System.out.println("Введите 'стоп' для завершения.");

		do {
			str = br.readLine();
			System.out.println(str);
		} while (!str.equalsIgnoreCase("стоп"));
	}

}
