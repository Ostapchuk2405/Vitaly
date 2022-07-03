/**
 * 
 */
package part17CollectionsFramework;

import java.util.ArrayList;

/**
 * Демонстрация использования ArrayList
 * 
 * @author Shiltd
 *
 */
class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		создать массив-список
		ArrayList<String> a1 = new ArrayList<String>();
		System.out.println("Начальный размер a1: " + a1.size());

//		добавить элементы в массив-список
		a1.add("C");
		a1.add("A");
		a1.add("E");
		a1.add("B");
		a1.add("D");
		a1.add("F");
		a1.add(1, "A2");
		System.out.println("Размер a1 после вставки: " + a1.size());

//		отобразить массив-список
		System.out.println("Содержимое а1: " + a1);

//		удалить элементы из массива-списка
		a1.remove("F");
		a1.remove(2);

		System.out.println("Размер а1 после удаления: " + a1.size());

		System.out.println("Содержимое а1: " + a1);
	}

}
