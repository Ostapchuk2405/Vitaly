package com.itbulls.learnit.ostapchuk.operations;

public class Envelope {

	public static void main(String[] args) {
		int column = 10;

		// Внешний цикл
		for (int i = 0; i < column; i++) {
			for (int row = 0; row < column; row++) {
				// Здесь условие даже немного проще
				if (row == column - 1 || row == column - i - 1 || i == column - 1 || i == 0 || row == 0 || row == i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			// Переход на следующую строку
			System.out.println();
		}
	}

}
