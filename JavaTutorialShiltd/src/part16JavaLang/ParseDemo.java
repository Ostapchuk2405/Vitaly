/**
 * 
 */
package part16JavaLang;

import java.io.*;

/**
 * Эта программа суммирует список целых чисел, введённых пользователем. Она
 * преобразует строковое представление каждого числа в целое, используя
 * pareseInt()
 * 
 * @author Shiltd
 *
 */
class ParseDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

//		Создать BufferedReader, используя System.in
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int i;
		int sum = 0;
		System.out.println("Введите число, 0 - для выхода.");
		do {
			str = br.readLine();
			try {
				i = Integer.parseInt(str);
			} catch (NumberFormatException e) {
				System.out.println("Неверный формат");
				i = 0;
			}
			sum += i;
			System.out.println("Текущая сумма: " + sum);
		} while (i != 0);
	}

}
