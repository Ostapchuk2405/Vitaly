/**
 * 
 */
package part17CollectionsFramework;

import java.util.*;

/**
 * ������������ ���������� Hashtable
 * 
 * @author Shiltd
 *
 */
class HashTableDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Hashtable<String, Double> balance = new Hashtable<String, Double>();

		Enumeration<String> names;

		String str;
		double bal;

		balance.put("���� ���", new Double(3434.34));
		balance.put("��� ����", new Double(123.22));
		balance.put("����� ������", new Double(1378.00));
		balance.put("��� ����", new Double(99.22));
		balance.put("����� ����", new Double(-19.08));

//		�������� ��� ����� � ���-�������
		names = balance.keys();
		while (names.hasMoreElements()) {
			str = names.nextElement();
			System.out.println(str + ": " + balance.get(str));
		}
		System.out.println();

//		�������� 1000 �� ���� ���� ���
		bal = balance.get("���� ���");
		balance.put("���� ���", bal + 1000);
		System.out.println("����� ������ ���� ���: " + balance.get("���� ���"));
	}

}
