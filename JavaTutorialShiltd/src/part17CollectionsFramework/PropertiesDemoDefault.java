/**
 * 
 */
package part17CollectionsFramework;

import java.util.*;

/**
 * ������������� ������ ������ �� ���������
 * 
 * @author Shiltd
 *
 */
class PropertiesDemoDefault {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Properties defList = new Properties();
		defList.put("�������", "�������");
		defList.put("���������", "�������");

		Properties capitals = new Properties(defList);
		capitals.put("��������", "����������");
		capitals.put("�������", "����������-����");
		capitals.put("���������", "�������");
		capitals.put("����������", "����������");
		capitals.put("�������", "������������");

//		�������� ����� ������
		Set<?> states = capitals.keySet();

//		�������� ��� ����� � �������
		for (Object name : states)
			System.out.println("������� ����� " + name + " - " + capitals.getProperty((String) name));
		System.out.println();

//		������ ������� ����� ������� � ������ �� ���������
		String str = capitals.getProperty("�������");
		System.out.println("������� ������� - " + str + ".");
	}

}
