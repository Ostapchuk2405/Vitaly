package com;

import java.util.Scanner;

public class MathLoop2 {

	public static void main(String[] args) {
		
		System.out.println("Введи число: ");
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		System.out.println("***** " + number + " *****");
		int cycle = 0;
		int max = 0;
		
		while (true) {
			if (number % 2 == 0) {
				number = number / 2;
			} else {
				number = 3 * number + 1;
			}
			cycle++;
			if (number > max) {
				max = number;
			}
			if (number == 1) {
				break;
			}

		}
		
		System.out.println("Максимальная производная: " + max);
		System.out.println("Количество циклов: " + cycle);
		
		sc.close();
	}

}
