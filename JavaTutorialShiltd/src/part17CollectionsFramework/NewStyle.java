/**
 * 
 */
package part17CollectionsFramework;

import java.util.*;

/**
 * �����������, ����������, ������.
 * 
 * @author Shiltd
 *
 */
class NewStyle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		������ list �������� ������ ���� String
		ArrayList<String> list = new ArrayList<String>();
		list.add("����");
		list.add("���");
		list.add("���");
		list.add("������");

//		������� , ��� �������� ����� ����������.
		Iterator<String> itr = list.iterator();

//		��������� �������� ������ ������� ������ ������� ����������
//		Iterator<Integer> itr = list.iterator();   // ������!
		while (itr.hasNext()) {
			String str = itr.next(); // ���������� �� ���������

//			������ ��������� ������ ������� ������ ����������, � �� ������� ����������
//			Integer i = itr.next();  // ��� �� ���������������
			System.out.println(str + " ����� ������ " + str.length() + " ��������.");

		}
	}

}
