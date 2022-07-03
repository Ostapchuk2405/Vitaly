/**
 * 
 */
package part17CollectionsFramework;

import java.util.*;

/**
 * ���������� ����� for-each ��� �������� ��������� ���������
 * 
 * @author Shiltd
 *
 */
class ForEachDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		������� ������-������ ��� ����� �����
		ArrayList<Integer> vals = new ArrayList<Integer>();

//		�������� �������� � ������-������
		vals.add(1);
		vals.add(2);
		vals.add(3);
		vals.add(4);
		vals.add(5);

//		������������ ���� ��� ����������� ��������
		System.out.print("�������� ����� vals: ");
		for (int v : vals)
			System.out.print(v + " ");
		System.out.println();

//		������������ �������� � ����� for
		int sum = 0;
		for (int v : vals)
			sum += v;
		System.out.println("����� ��������: " + sum);
	}

}
