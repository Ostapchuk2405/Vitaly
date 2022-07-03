/**
 * 
 */
package part17CollectionsFramework;

import java.util.*;

/**
 * Применение цикла for-each для перебора элементов коллекции
 * 
 * @author Shiltd
 *
 */
class ForEachDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		создать массив-список для целых чисел
		ArrayList<Integer> vals = new ArrayList<Integer>();

//		добавить значение в массив-список
		vals.add(1);
		vals.add(2);
		vals.add(3);
		vals.add(4);
		vals.add(5);

//		использовать цикл для отображения значений
		System.out.print("Исходное число vals: ");
		for (int v : vals)
			System.out.print(v + " ");
		System.out.println();

//		суммирование значений в цикле for
		int sum = 0;
		for (int v : vals)
			sum += v;
		System.out.println("Сумма значений: " + sum);
	}

}
