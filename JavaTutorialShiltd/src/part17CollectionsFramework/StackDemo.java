/**
 * 
 */
package part17CollectionsFramework;

import java.util.*;

/**
 * ������������ ���������� ������ Stack
 * 
 * @author Shiltd
 *
 */
class StackDemo {

	/**
	 * @param args
	 */
	static void showpush(Stack<Integer> st, int a) {
		st.push(a);
		System.out.println("push(" + a + ")");
		System.out.println("����: " + st);
	}

	static void showpop(Stack<Integer> st) {
		System.out.print("pop -> ");
		Integer a = st.pop();
		System.out.println(a);
		System.out.println("����: " + st);
	}

	public static void main(String[] args) {

		Stack<Integer> st = new Stack<Integer>();

		System.out.println("����: " + st);

		showpush(st, 42);
		showpush(st, 66);
		showpush(st, 99);
		showpop(st);
		showpop(st);
		showpop(st);

		try {
			showpop(st);
		} catch (EmptyStackException e) {
			System.out.println("���� ����.");
		}
	}

}
