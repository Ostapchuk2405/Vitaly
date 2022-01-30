package com;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¬веди число дл€ подсчЄта его факториала: ");
		int number = sc.nextInt();
		
		int factorial = 1;		
		while(number != 1) {
			factorial = factorial * number;
			number--;
		}
		
		System.out.println(factorial);
		sc.close();
	}

}
