/**
 * 
 */
package part17CollectionsFramework;

import java.util.ArrayDeque;

/**
 * ������������ ���������� ArrayDeque
 * @author Shiltd
 *
 */
class ArrayDequeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		������� ������������� �������
		ArrayDeque<String> adq = new ArrayDeque<String>();
		
//		������������� ArrayDeque � ���� �����
		adq.push("A");
		adq.push("B");
		adq.push("D");
		adq.push("E");
		adq.push("F");
		
		System.out.print("����������� �� �����: ");
		
		while (adq.peek() != null) {
			System.out.print(adq.pop() + " ");
		}
		System.out.println();
	}

}
