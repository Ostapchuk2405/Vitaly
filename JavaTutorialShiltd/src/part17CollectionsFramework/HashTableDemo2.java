/**
 * 
 */
package part17CollectionsFramework;

import java.util.*;

/**
 * ���������� ���������� � Hashtable
 * 
 * @author Shiltd
 *
 */
class HashTableDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Hashtable<String, Double> balance = new Hashtable<String, Double>();

		String str;
		double bal;

		balance.put("���� ���", 3434.34);
		balance.put("��� ����", new Double(123.22));
		balance.put("����� ������", new Double(1378.00));
		balance.put("��� ����", new Double(99.22));
		balance.put("����� ����", new Double(-19.08));

//		���������� ��� ����� � ���-�������
//		��� ������ �������� ����� � ���� ������
		Set<String> set = balance.keySet();

//		�������� �������� 
		Iterator<String> itr = set.iterator();

		while (itr.hasNext()) {
			str = itr.next();
			System.out.println(str + ": " + balance.get(str));
		}
		System.out.println();

//		�������� 1000 �� ���� ���� ���
		bal = balance.get("���� ���");
		balance.put("���� ���", bal + 1000);
		System.out.println("����� ������ ���� ���: " + balance.get("���� ���"));
	}

}
