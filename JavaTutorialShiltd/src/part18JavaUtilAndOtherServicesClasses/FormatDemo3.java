/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.Formatter;

/**
 * Демонстрация применения спецификаторов формата %n %%
 * 
 * @author Schiltd
 *
 */
class FormatDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Formatter fmt = new Formatter();

		fmt.format("Копирование файла%nПеремещение на %d%% завершено.", 88);
		System.out.println(fmt);
		fmt.close();
	}

}
