/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.*;

/**
 * ������������ ������ ��������
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

//		�������� ������ �� ���������
		ResourceBundle rd = ResourceBundle.getBundle("SampleRB");

		System.out.println("������������ ������:");
		System.out.println("������ ��� ����� Title: " + rd.getString("title"));
		System.out.println("������ ��� ����� StopNext: " + rd.getString("StopText"));
		System.out.println("������ ��� ����� StartText: " + rd.getString("StartText"));

//		��������� �������� ������
		rd = ResourceBundle.getBundle("SampleRB", Locale.GERMAN);

		System.out.println("\n�������� ������: ");
		System.out.println("������ ��� ����� Title: " + rd.getString("title"));
		System.out.println("����� ��� ����� StopNext: " + rd.getString("StopText"));
		System.out.println("������ ��� ����� StartText: " + rd.getString("StartText"));
	}

}
