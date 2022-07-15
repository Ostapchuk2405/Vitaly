/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.io.*;
import java.util.Scanner;

/**
 * Использование Scanner для вычисления среднего значения числа файла
 * 
 * @author Schiltd
 *
 */
class AvgFile {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		int count = 0;
		double sum = 0.0;

//		записать вывод  в файл
		FileWriter fout = new FileWriter("resources\\part18\\AvgFile.txt");
		fout.write("2 3,4 5 6 7,4 9,1 10,5 готово");
		fout.close();

		FileReader fin = new FileReader("resources\\part18\\AvgFile.txt");
		Scanner conin = new Scanner(fin);

//		читать и суммировать значение
		while (conin.hasNext()) {
			if (conin.hasNextDouble()) {
				sum += conin.nextDouble();
				count++;
			} else {
				String str = conin.next();
				if (str.equals("готово"))
					break;
				else {
					System.out.println("Ошибка формата данных.");
					return;
				}
			}

		}
		conin.close();
		System.out.println("Среднее равно  " + sum / count);

	}

}
