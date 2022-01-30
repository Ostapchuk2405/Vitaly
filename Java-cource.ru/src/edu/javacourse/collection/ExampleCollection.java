package edu.javacourse.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ExampleCollection {

	public static void main(String[] args) {

		Collection col1 = createFirstCollection();
		Collection col2 = createSecondCollection();

		System.out.println("===== Проход по коллекции =====");
		for (Object o : col1) {
			System.out.println("Item: " + o);
		}
		System.out.println();

		System.out.println("===== Проход по коллекции через итератор =====");
		for (Iterator it = col1.iterator(); it.hasNext();) {
			String s = (String) it.next();
			System.out.println("Item: " + s);
		}
		System.out.println();

		System.out.println("===== Групповые операции =====");
		if (col1.containsAll(col2)) {
			System.out.println("Коллекция 1 содержит все элементы коллекции 2");
		}
		System.out.println();

		System.out.println("===== Добавление всех элементов =====");
		col1.addAll(col2);
		for (Object o : col1) {
			System.out.println("Item: " + o);
		}
		System.out.println();

		System.out.println("===== Удаление всех элементов col2, которые есть в col1");
		col1.removeAll(col2);
		for (Object o : col1) {
			System.out.println("Item: " + o);
		}
		System.out.println();

//		Пересоздаём коллекции
		col1 = createFirstCollection();
		col2 = createSecondCollection();

		System.out.println("===== Удаление элементов из col1, которых нет в col2");
		col1.retainAll(col2);
		for (Object o : col1) {
			System.out.println("Item: " + o);
		}
		System.out.println();

		col1 = createFirstCollection();
		System.out.println("===== Удаление через итератор =====");
		while (!col1.isEmpty()) {
			Iterator it = col1.iterator();
			Object o = it.next();
			System.out.println("Удаление: " + o);
			it.remove();
		}

	}

	private static Collection createFirstCollection() {
		Collection col = new ArrayList();
		col.add("1");
		col.add("2");
		col.add("3");
		col.add("4");
		col.add("5");
		col.add("6");
		col.add("7");
		return col;
	}

	private static Collection createSecondCollection() {
		Collection col2 = new ArrayList();
		col2.add("1");
		col2.add("2");
		col2.add("3");
		return col2;
	}

}
