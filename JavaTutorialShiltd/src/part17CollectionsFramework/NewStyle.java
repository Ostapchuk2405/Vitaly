/**
 * 
 */
package part17CollectionsFramework;

import java.util.*;

/**
 * Современная, обобщённая, версия.
 * 
 * @author Shiltd
 *
 */
class NewStyle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		теперь list содержит ссылки типа String
		ArrayList<String> list = new ArrayList<String>();
		list.add("один");
		list.add("два");
		list.add("три");
		list.add("четыре");

//		Отметим , что итератор также обобщённый.
		Iterator<String> itr = list.iterator();

//		следующий оператор теперь вызовет ошибку времени компиляции
//		Iterator<Integer> itr = list.iterator();   // Ошибка!
		while (itr.hasNext()) {
			String str = itr.next(); // приведение не требуется

//			Теперь следующая строка породит ошибку компиляции, а не времени выполнения
//			Integer i = itr.next();  // Это не откомпелируется
			System.out.println(str + " имеет длинну " + str.length() + " символов.");

		}
	}

}
