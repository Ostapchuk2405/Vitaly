/**
 * 
 */
package part17CollectionsFramework;

import java.util.*;

/**
 * Демонстрация применения различных алгоритмов
 * 
 * @author Shiltd
 *
 */
class AlgorithmsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		Создать неинициализированный связный список.
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(-8);
		ll.add(20);
		ll.add(-20);
		ll.add(8);

//		Создание компоратора обратного порядка
		Comparator<Integer> r = Collections.reverseOrder();
//		Сортировать список этим компаратором.
		Collections.sort(ll, r);
		System.out.print("Список отсортирован в обратном порядке: ");
		for (int i : ll)
			System.out.print(i + " ");
		System.out.println();

//		Тасовать список
		Collections.shuffle(ll);
//		Отобразить перемешанный список
		System.out.print("Список перемешан: ");
		for (int i : ll)
			System.out.print(i + " ");
		System.out.println();

		System.out.println("Минимум: " + Collections.min(ll));
		System.out.println("Максимум: " + Collections.max(ll));
	}

}
