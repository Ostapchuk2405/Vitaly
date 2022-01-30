package edu.javacourse.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<MyClass> list = new ArrayList<MyClass>();
		list.add(new MyClass("Василий"));
		list.add(new MyClass("Павел"));
		list.add(new MyClass("Андрей"));
		list.add(new MyClass("Андрей"));
		list.add(new MyClass("Пётр"));
		list.add(new MyClass("Анжелика"));

		printCollection("Оригинал", list);

		Collections.shuffle(list);
		printCollection("Смешивание", list);

		Collections.reverse(list);
		printCollection("Обратный порядок", list);

		Collections.rotate(list, 2);
		printCollection("Проворачивание", list);

		Collections.swap(list, 0, list.size() - 1);
		printCollection("Обмен элементами", list);

		Collections.replaceAll(list, new MyClass("Андрей"), new MyClass("Алексей"));
		printCollection("Замена", list);

		List<MyClass> list2 = new ArrayList<MyClass>(list.size());
		for (MyClass mc : list) {
			list2.add(null);
		}

		Collections.copy(list2, list);
		printCollection("Копирование", list2);

		Collections.fill(list2, new MyClass("Антон"));
		printCollection("Полная замена", list2);

	}

	private static void printCollection(String title, List<MyClass> list) {
		System.out.println(title);
		for (MyClass mc : list) {
			System.out.println("Item: " + mc);
		}
		System.out.println();
	}

}
