/**
 * 
 */
package part17CollectionsFramework;

import java.util.*;

/**
 * ������ ������������� ��������� �� �������� ���������
 * 
 * @author Shiltd
 *
 */
class OldStyle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList list = new ArrayList();
//		lines ������ ������, �� ����� ���� ��������� ������� ������ ����.
//		� ���� ������� ����� ��� ����������� �������� ��� ����������� � ��������� ��������.
		list.add("����");
		list.add("���");
		list.add("���");
		list.add("������");
		Iterator itr = list.iterator();

		while (itr.hasNext()) {
//			����� ������� �������, ��������� ����� ���������� �����,
//			������ ��� ��������� ������ ������ Object
			String str = (String) itr.next(); // ����� ���������� ���������� �����,
			System.out.println(str + " ����� ������ " + str.length() + " ��������.");

		}
	}

}
