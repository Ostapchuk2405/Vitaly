package edu.javacourse.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExample {

	public static void main(String[] args) {

		List<String> test = new ArrayList<>();
		for (int i = 1; i < 6; i++) {
			test.add("\tСтрока " + i);
		}

		System.out.println("===== Печать через цикл foreach =====");
		for (String s : test) {
			System.out.println(s);
		}
		System.out.println();

		System.out.println("===== Печать через итератор =====");
		for (Iterator<String> it = test.iterator(); it.hasNext();) {
			String s = it.next();
			System.out.println(s);
		}
		System.out.println();

		System.out.println("===== Печать через итератор списка от конца к началу =====");
		for (ListIterator<String> li = test.listIterator(test.size()); li.hasPrevious();) {
			String s = li.previous();
			System.out.println(s);
		}
		System.out.println();

		System.out.println("===== Печать через итератор списка от начала к концу =====");
		for (ListIterator<String> li = test.listIterator(); li.hasNext();) {
			String s = li.next();
			System.out.println(s);
		}
		System.out.println();

		System.out.println("===== Печать через индекс элемента =====");
		for (int i = 0; i < test.size(); i++) {
			String s = test.get(i);
			System.out.println(s);
		}

	}

}
