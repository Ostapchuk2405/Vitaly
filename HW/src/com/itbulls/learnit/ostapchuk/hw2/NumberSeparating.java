package com.itbulls.learnit.ostapchuk.hw2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NumberSeparating {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("¬веди любое число, программа выдaст его по цифрам");
		int number = sc.nextInt();

		ArrayList<Integer> reverseDigits = new ArrayList<>();

		while (number != 0) {
			int digit = number % 10;

			reverseDigits.add(digit);
			number /= 10;
		}

		System.out.println(Arrays.asList(reverseDigits));

		for (int i = reverseDigits.size() - 1; i >= 0; i--) {
			System.out.println(reverseDigits.get(i));
		}

		sc.close();

	}

}
