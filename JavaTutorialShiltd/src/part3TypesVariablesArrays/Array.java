/**
 * 
 */
package part3TypesVariablesArrays;

/**
 * ƒемонстраци€ использовани€ одноиерного массива
 * 
 * @author Shiltd
 * @return элемент массива по его индексу
 *
 */
public class Array {

	/**
	 * @param args инициализаци€ количества дней мес€цев
	 */
	public static void main(String[] args) {

		int monthDays[] = new int[12];
		monthDays[0] = 31;
		monthDays[1] = 28;
		monthDays[2] = 31;
		monthDays[3] = 30;
		monthDays[4] = 31;
		monthDays[5] = 30;
		monthDays[6] = 31;
		monthDays[7] = 31;
		monthDays[8] = 30;
		monthDays[9] = 31;
		monthDays[10] = 30;
		monthDays[11] = 31;

		System.out.println("¬ апреле " + monthDays[4] + " дней.");

	}

}
