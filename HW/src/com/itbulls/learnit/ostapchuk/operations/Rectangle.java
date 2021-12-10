package com.itbulls.learnit.ostapchuk.operations;

public class Rectangle {

	public static void main(String[] args) {

		int column = 10;

		for (int i = 0; i <= 5; i++) {

			for (int j = 0; j <= column; j++) {

				if (i == 5 || j == column/2 - i || j == column / 2 + i) {
					System.out.print("^");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
