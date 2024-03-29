/**
 * 
 */
package part17CollectionsFramework;

import java.util.Arrays;

/**
 * ������������ ���������� Arrays
 * 
 * @author Shiltd
 *
 */
class ArraysDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		������������ � ���������������� ������
		int array[] = new int[10];
		for (int i = 0; i < 10; i++)
			array[i] = -3 * i;
//		����������, ������������� � ����� ���������� ������
		System.out.print("�������� ����������: ");
		display(array);
		Arrays.sort(array);
		System.out.print("��������������� ������: ");
		display(array);

//		���������� � ����������� �������
		Arrays.fill(array, 2, 6, -1);
		System.out.print("����� fill(): ");
		display(array);

//		����������� � ���������� ������
		Arrays.sort(array);
		System.out.print("����� ��������� ����������: ");
		display(array);

//		�������� ����� �������� -9
		System.out.print("�������� -9 ��������� � ������� ");
		int index = Arrays.binarySearch(array, -9);
		System.out.println(index);
	}

	private static void display(int[] array) {
		for (int i : array)
			System.out.print(i + " ");
		System.out.println();
	}

}
