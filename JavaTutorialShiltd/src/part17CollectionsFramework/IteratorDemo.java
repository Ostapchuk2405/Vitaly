/**
 * 
 */
package part17CollectionsFramework;

import java.util.*;

/**
 * Демонстрация применения итераторов
 * 
 * @author Shiltd
 *
 */
class IteratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		создать элементы в массив-список
		ArrayList<String> al = new ArrayList<String>();

//		добавить элементы в массив-список
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");

//		использовать итераторы для отображения содержимого al
		System.out.print("Исходное содержимое al: ");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();

//		модифицировать текущий объект итерации
		ListIterator<String> litr = al.listIterator();
		while (litr.hasNext()) {
			String element = litr.next();
			litr.set(element + "+");
		}

		System.out.print("Модифицированное содержимое al: ");
		itr = al.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();

//		теперь отображаем список в обратном порядке
		System.out.print("Модифицированный список в обратном орядке: ");
		while (litr.hasPrevious()) {
			String element = litr.previous();
			System.out.print(element + " ");
		}
		System.out.println();
	}

}
