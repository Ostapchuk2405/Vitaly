package com.itbulls.learnit.ostapchuk.hw1;

import java.util.Scanner;

public class GreatestCommonDivision {

	public static int greatestDivisor(int firstNumber, int secondNumber) {
		if (secondNumber == 0) {
			return Math.abs(firstNumber);
		} else {
			return greatestDivisor(secondNumber, firstNumber % secondNumber);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("¬веди два числа, разделЄнных пробелом: ");
		String userInput = sc.nextLine();

		String[] numbers = userInput.split("\\s+");
		int number1 = Integer.parseInt(numbers[0]);
		int number2 = Integer.parseInt(numbers[1]);

		System.out.println(greatestDivisor(number1, number2));

		sc.close();

	}

}
