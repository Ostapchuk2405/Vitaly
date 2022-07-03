/**
 * 
 */
package part17CollectionsFramework;

import java.util.ArrayDeque;

/**
 * Демонстрация применения ArrayDeque
 * @author Shiltd
 *
 */
class ArrayDequeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		создать двухстороннюю очередь
		ArrayDeque<String> adq = new ArrayDeque<String>();
		
//		использование ArrayDeque в виде стэка
		adq.push("A");
		adq.push("B");
		adq.push("D");
		adq.push("E");
		adq.push("F");
		
		System.out.print("Выталкиваем из стэка: ");
		
		while (adq.peek() != null) {
			System.out.print(adq.pop() + " ");
		}
		System.out.println();
	}

}
