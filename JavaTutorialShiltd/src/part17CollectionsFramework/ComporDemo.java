/**
 * 
 */
package part17CollectionsFramework;

import java.util.*;

/**
 * ������������� �������������� �����������
 * 
 * @author Shiltd
 *
 */

class MyComporat implements Comparator<String> {

	@Override
	public int compare(String a, String b) {
		String aStr, bStr;
		aStr = a;
		bStr = b;
		return b.compareTo(aStr);
	}
//	��� ������������� �������������� equals	
}

class ComporDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ������� TreeSet.
		TreeSet<String> ts = new TreeSet<String>(new MyComporat());
//		�������� �������� � �����-������.
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");

//		���������� ��������.
		for (String element : ts)
			System.out.print(element + " ");
		System.out.println();

	}

}
