package com.itbulls.learnit.ostapchuk.hw2;

import java.util.Scanner;

public class NumberSeparating2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ����� �����, ��������� ���a�� ��� �� ������");
		char[] number =sc.nextLine().toCharArray();

		
		for(int i = 0; i < number.length; i ++) {
			System.out.println(number[i]);
		}
		
		sc.close();
	}
	

}
