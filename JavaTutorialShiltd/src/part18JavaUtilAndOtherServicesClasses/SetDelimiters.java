/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.io.*;
import java.util.Scanner;

/**
 * Применение Scanner для вычисления среднего в списке разделённых запятыми
 * значений
 * 
 * @author Schiltd
 *
 */
class SetDelimiters {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		int count = 0;
		double sum = 0.0;

//		писать вывод в файл
		FileWriter fout = new FileWriter("resources\\part18\\SetDelimiters.txt");

//		теперь сохраним значения в списке, разделённым запятыми
		fout.write("2, 3,4, 5,6, 7,4, 9,1, 10,5, готово");
		fout.close();

		FileReader fin = new FileReader("resources\\part18\\SetDelimiters.txt");
		Scanner src = new Scanner(fin);

//		установить в качестве разделителей запятые и пробелы
		src.useDelimiter(", *");

//		читать и суммировать значения
		while (src.hasNext()) {
			if (src.hasNextDouble()) {
				sum += src.nextDouble();
				count++;
			} else {
				String str = src.next();
				if (str.equals("готово"))
					break;
				else {
					System.out.println("Ошибка формата данных.");
					return;
				}
			}

		}
		src.close();
		System.out.println("Среднее равно  " + sum / count);
	}

}
