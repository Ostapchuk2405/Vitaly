/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.*;

/**
 * Демонстрация связки ресурсов
 * 
 * @author Schiltd
 *
 */

//public class SampleRB extends ListResourceBundle {
//
//	@Override
//	protected Object[][] getContents() {
//		Object[][] resources = new Object[3][2];
//
//		resources[0][0] = "title";
//		resources[0][1] = "My Program";
//
//		resources[1][0] = "StopText";
//		resources[1][1] = "Stop";
//
//		resources[2][0] = "StartText";
//		resources[2][1] = "Start";
//
//		return resources;
//	}
//
//}
//
//public class SampleRB_de extends ListResourceBundle {
//
//	@Override
//	protected Object[][] getContents() {
//		Object[][] resources = new Object[3][2];
//
//		resources[0][0] = "title";
//		resources[0][1] = "Mein Program";
//
//		resources[1][0] = "StopText";
//		resources[1][1] = "Anschlag";
//
//		resources[2][0] = "StartText";
//		resources[2][1] = "Anfang";
//
//		return resources;
//	}
//
//}

class ListResouresBundleDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		загрузиь связку по умолчанию
		ResourceBundle rd = ResourceBundle.getBundle("SampleRB");

		System.out.println("Англоязычная версия:");
		System.out.println("Строка для ключа Title: " + rd.getString("title"));
		System.out.println("Строка для ключа StopNext: " + rd.getString("StopText"));
		System.out.println("Строка для ключа StartText: " + rd.getString("StartText"));

//		загрузить немецкую связку
		rd = ResourceBundle.getBundle("SampleRB", Locale.GERMAN);

		System.out.println("\nНемецкая версия: ");
		System.out.println("Строка для ключа Title: " + rd.getString("title"));
		System.out.println("Срока для ключа StopNext: " + rd.getString("StopText"));
		System.out.println("Строка для ключа StartText: " + rd.getString("StartText"));
	}

}
