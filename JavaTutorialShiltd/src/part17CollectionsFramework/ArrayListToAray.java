/**
 * 
 */
package part17CollectionsFramework;

import java.util.*;

/**
 * Преобразование ArrayList в массив
 * 
 * @author Shiltd
 *
 */
class ArrayListToAray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		создать массив-список
		ArrayList<Integer> a1 = new ArrayList<Integer>();

//		добавить элементы в массив-список
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);

		System.out.println("Содержимое а1: " + a1);

//		получить массив
		Integer ia[] = new Integer[a1.size()];
		ia = a1.toArray(ia);

		int sum = 0;

//		Суммировать массив
		for (int i : ia)
			sum += i;

		System.out.println("Сумма: " + sum);
	}

}
