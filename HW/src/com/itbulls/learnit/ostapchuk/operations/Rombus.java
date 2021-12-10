package com.itbulls.learnit.ostapchuk.operations;

public class Rombus {

	public static void main(String[] args) {

		int column = 11;
		int row = 11;

		for (int i = 0; i < column; i++) {

			for (int j = 0; j < row; j++) {

				if (j == row / 2 - i || j == row / 2 + i || i == column / 2 + j || i == column / 2 - 1 + (row - j)) {
					System.out.print("x");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
