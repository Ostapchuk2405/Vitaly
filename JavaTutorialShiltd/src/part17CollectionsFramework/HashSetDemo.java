/**
 * 
 */
package part17CollectionsFramework;

import java.util.*;

/**
 * ������������ ���������� HashSet. � LinkedHashSet �������� ����� � ��� �� �������, � ������� �� �������� � ���������
 * 
 * @author Shiltd
 *
 */
class HashSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		������� ���-�����
		HashSet<String> hs = new HashSet<String>();

//		�������� �������� � ���-�����
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("E");
		hs.add("C");
		hs.add("F");

		System.out.println(hs);
	}

}
