/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.Scanner;

/**
 * Демонстрация применения FindInLine
 * 
 * @author Schiltd
 *
 */
class FindInLineDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String instr = "Имя: Том Возраст: 28 ID: 77";
		Scanner conin = new Scanner(instr);

//		найти и отобразить возраст
		conin.findInLine("Возраст:"); // найти возраст
		if (conin.hasNext())
			System.out.println("\n\t" + conin.next());
		else {
			System.out.println("Ошибка!");
		}

		conin.close();
	}

}
