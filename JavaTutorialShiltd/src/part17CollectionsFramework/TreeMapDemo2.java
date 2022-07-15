/**
 * 
 */
package part17CollectionsFramework;

import java.util.*;

/**
 * ������������� ����������� ��� ���������� �� �������.
 * 
 * @author Shiltd
 *
 */

class TCom implements Comparator<String> {

	@Override
	public int compare(String a, String b) {
		int i, j, k;
		String aStr, bStr;
		aStr = a;
		bStr = b;
//		����� ������ ������� � ������, � �������� ���������� �������.
		i = aStr.lastIndexOf(' ');
		j = bStr.lastIndexOf(' ');
		k = aStr.substring(i).compareTo(bStr.substring(j));
		if (k == 0)		 // ������� ���������,��������� ������ ���
			return aStr.compareTo(bStr);
		else
			return k;
	}
//		��� ������������� �������������� equals
}

class TreeMapDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		������� �����-������.
		TreeMap<String, Double> tm = new TreeMap<String, Double>(new TCom());

//		��������� �������� � �����
		tm.put("���� ���", new Double(3434.34));
		tm.put("��� ����", new Double(123.22));
		tm.put("����� ������", new Double(1378.00));
		tm.put("��� ����", new Double(99.22));
		tm.put("����� ����", new Double(-19.08));

//		�������� ����� ���������
		Set<Map.Entry<String, Double>> set = tm.entrySet();

//		���������� �����
		for (Map.Entry<String, Double> me : set) {
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println();
		
//		�������� 1000 �� ���� ���� ���
		double balance = tm.get("���� ���");
		tm.put("���� ���", balance + 1000);
		System.out.println("����� ������ ���� ���: " + tm.get("���� ���"));
	}

}
