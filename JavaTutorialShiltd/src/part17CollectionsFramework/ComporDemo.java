/**
 * 
 */
package part17CollectionsFramework;

import java.util.*;

/**
 * Использование настраиваемого компоратора
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
//	Нет необходимости переопределять equals	
}

class ComporDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Создать TreeSet.
		TreeSet<String> ts = new TreeSet<String>(new MyComporat());
//		Добавить элементы в набор-дерева.
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");

//		Отобразить элементы.
		for (String element : ts)
			System.out.print(element + " ");
		System.out.println();

	}

}
