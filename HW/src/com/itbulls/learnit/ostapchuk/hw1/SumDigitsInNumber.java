package com.itbulls.learnit.ostapchuk.hw1;

import java.util.Scanner;

public class SumDigitsInNumber {
	
	public static int sumDigitsInNumber(int number) {
		int sum = 0;
		while(number != 0) {
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¬веди любое число и оно выдаст сумму его цифр:");
		
		int userInput = sc.nextInt();
		
		System.out.println(sumDigitsInNumber(userInput));
		
		sc.close();

	}

}
