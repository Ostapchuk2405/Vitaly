/**
 * 
 */
package part17CollectionsFramework;

import java.util.*;

/**
 * ������������ ���-�����
 * 
 * @author Shiltd
 *
 */
class HashMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		������� ���-�����
		HashMap<String, Double> hm = new HashMap<String, Double>();

//		��������� �������� � �����
		hm.put("���� ���", new Double(3434.34));
		hm.put("��� ����", new Double(123.22));
		hm.put("����� ������", new Double(1378.00));
		hm.put("��� ����", new Double(99.22));
		hm.put("����� ����", new Double(-19.08));

//		�������� ����� ���������
		Set<Map.Entry<String, Double>> set = hm.entrySet();

//		���������� �����
		for (Map.Entry<String, Double> me : set) {
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println();

//		�������� 1000 �� ���� ���� ���
		double balance = hm.get("���� ���");
		hm.put("���� ���", balance + 1000);
		System.out.println("����� ������ ���� ���: " + hm.get("���� ���"));
	}

}
