/**
 * 
 */
package part17CollectionsFramework;

import java.util.*;

/**
 * ������������ ���������� ����������
 * 
 * @author Shiltd
 *
 */
class IteratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		������� �������� � ������-������
		ArrayList<String> al = new ArrayList<String>();

//		�������� �������� � ������-������
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");

//		������������ ��������� ��� ����������� ����������� al
		System.out.print("�������� ���������� al: ");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();

//		�������������� ������� ������ ��������
		ListIterator<String> litr = al.listIterator();
		while (litr.hasNext()) {
			String element = litr.next();
			litr.set(element + "+");
		}

		System.out.print("���������������� ���������� al: ");
		itr = al.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();

//		������ ���������� ������ � �������� �������
		System.out.print("���������������� ������ � �������� ������: ");
		while (litr.hasPrevious()) {
			String element = litr.previous();
			System.out.print(element + " ");
		}
		System.out.println();
	}

}
