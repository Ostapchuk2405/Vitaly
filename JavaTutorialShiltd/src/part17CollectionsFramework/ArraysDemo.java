/**
 * 
 */
package part17CollectionsFramework;

import java.util.Arrays;

/**
 * Демонстрация применения Arrays
 * 
 * @author Shiltd
 *
 */
class ArraysDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		Распределить и инициализировать массив
		int array[] = new int[10];
		for (int i = 0; i < 10; i++)
			array[i] = -3 * i;
//		отобразить, отсортировать и вновь отобразить массив
		System.out.print("Исходное содержимое: ");
		display(array);
		Arrays.sort(array);
		System.out.print("Отсортированный список: ");
		display(array);

//		Наполнение и отображение массива
		Arrays.fill(array, 2, 6, -1);
		System.out.print("После fill(): ");
		display(array);

//		Сортировать и отобразить массив
		Arrays.sort(array);
		System.out.print("После повторной сортировки: ");
		display(array);

//		Бинарный поиск значения -9
		System.out.print("Значение -9 находится в позиции ");
		int index = Arrays.binarySearch(array, -9);
		System.out.println(index);
	}

	private static void display(int[] array) {
		for (int i : array)
			System.out.print(i + " ");
		System.out.println();
	}

}
