package edu.javacourse.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<MyClass> list = new ArrayList<MyClass>();
		list.add(new MyClass("�������"));
		list.add(new MyClass("�����"));
		list.add(new MyClass("������"));
		list.add(new MyClass("������"));
		list.add(new MyClass("ϸ��"));
		list.add(new MyClass("��������"));

		printCollection("��������", list);

		Collections.shuffle(list);
		printCollection("����������", list);

		Collections.reverse(list);
		printCollection("�������� �������", list);

		Collections.rotate(list, 2);
		printCollection("��������������", list);

		Collections.swap(list, 0, list.size() - 1);
		printCollection("����� ����������", list);

		Collections.replaceAll(list, new MyClass("������"), new MyClass("�������"));
		printCollection("������", list);

		List<MyClass> list2 = new ArrayList<MyClass>(list.size());
		for (MyClass mc : list) {
			list2.add(null);
		}

		Collections.copy(list2, list);
		printCollection("�����������", list2);

		Collections.fill(list2, new MyClass("�����"));
		printCollection("������ ������", list2);

	}

	private static void printCollection(String title, List<MyClass> list) {
		System.out.println(title);
		for (MyClass mc : list) {
			System.out.println("Item: " + mc);
		}
		System.out.println();
	}

}
