/**
 * 
 */
package part17CollectionsFramework;

import java.util.*;

/**
 * ������������ ��������� �������� � Vector.
 * 
 * @author Shiltd
 *
 */
class VectorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		��������� ������ 3, ��������� 2.
		Vector<Integer> v = new Vector<Integer>(3, 2);
		System.out.println("��������� ������: " + v.size());
		System.out.println("��������� �������: " + v.capacity());

		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		System.out.println("������� ����� �������� ����������: " + v.capacity());

		v.addElement(5);
		System.out.println("������� �������: " + v.capacity());

		v.addElement(6);
		v.addElement(7);
		System.out.println("������� �������: " + v.capacity());

		v.addElement(9);
		v.addElement(10);
		System.out.println("������� �������: " + v.capacity());

		v.addElement(11);
		v.addElement(12);
		System.out.println("������ �������: " + v.firstElement());
		System.out.println("��������� �������: " + v.lastElement());

		if (v.contains(3))
			System.out.println("������ �������� 3.");

//		������� ��������� �������
		Enumeration<Integer> vEnum = v.elements();

		System.out.println("\n�������� �������:");
		while (vEnum.hasMoreElements())
			System.out.print(vEnum.nextElement() + " ");
		System.out.println();
	}

}
