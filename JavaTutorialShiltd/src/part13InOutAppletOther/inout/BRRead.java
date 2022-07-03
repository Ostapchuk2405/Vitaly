/**
 * 
 */
package part13InOutAppletOther.inout;

/**
 * Использование BufferReader для чтения символов с консоли
 * 
 * @author Shiltd
 *
 */

import java.io.*;

class BRRead {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Вводите символы, 'q' - для выхода.");

//		Читать символы
		do {
			c = (char) br.read();
			System.out.println(c);
		} while (c != 'q');
	}

}
