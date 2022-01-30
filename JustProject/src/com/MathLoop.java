package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class MathLoop {

	/*
	 * �������������� ������ �����������. ����� x ������������� �� �������: ����
	 * ������, �� - � / 2 ���� ��������, �� - 3� + 1. ������ ��������� ��������
	 * ��������� ���������� ������ �� �������, ��� ������� �������� ��� �������
	 * ����������� ������ �������� ����� �� ����� �����, ������� ����� ��������� �
	 * �������������
	 */

//	���� ��� ��������� ����� x ��������� � ����� (4 - 2 - 1)

	public static void main(String[] args) {

		System.out.println("����� ����� ��� ������ ������: ");

		ArrayList<Integer> maxes = new ArrayList<Integer>();
		ArrayList<Integer> cycles = new ArrayList<Integer>();

		HashMap<Integer, Integer> numbersMaxPeak = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> numbersMaxCycles = new HashMap<Integer, Integer>();

		for (int index = 0; index < 100000; index++) {
			int cycle = 0;
			int maxX = 0;
			int number = index + 5;

			System.out.println();
			System.out.println("***** ����� " + number + " *****");

			while (true) {
				if (number % 2 == 0) {
					number = number / 2;
				} else {
					number = 3 * number + 1;
				}
				cycle++;
				if (number > maxX) {
					maxX = number;
				}
				if (number == 1) {
					break;
				}

			}

			System.out.println("���������� ������ = " + cycle);
			System.out.println("������������ ����������� = " + maxX);

			maxes.add(maxX);
			cycles.add(cycle);

			numbersMaxPeak.put(index, maxX);
			numbersMaxCycles.put(index, cycle);
		}

		int numberWithMaxDerivative = maxes.indexOf(Collections.max(maxes));
		// ������� ������������ ����������� �� ����� ������� ���������
		System.out.println();
		System.out.println("***** CONCLUSION *****");
		System.out.println("������������ ������������ �� ����� ������� ���������: [ " + Collections.max(maxes) + " ]");
//		������� ������������ ���������� ������ � �����
		System.out.println("������������ ���������� ������: [ " + Collections.max(cycles) + " ]");
		System.out.println();

//		����� ���� ���������� ��� ����� ����� ����� ������������ ����������� � �����
		System.out.println("������������ ����������� � �����: " + numberWithMaxDerivative + " + 5");
		System.out
				.println("������������ ���������� ������ � �����: " + cycles.indexOf(Collections.max(cycles)) + " + 5");
		System.out.println();

		int numberOfKey = 0;
		int maxValueInMap = (Collections.max(numbersMaxPeak.values()));
		for (Entry<Integer, Integer> entry : numbersMaxPeak.entrySet()) {
			if (entry.getValue() == maxValueInMap) {
				numberOfKey = entry.getKey() + 5;
			}
		}
		System.out.println("������������ �����������: " + maxValueInMap + " � �����: " + numberOfKey);

		int keyOfCycles = 0;
		int maxValueInCycles = (Collections.max(numbersMaxCycles.values()));
		for (Entry<Integer, Integer> entry : numbersMaxCycles.entrySet()) {
			if (entry.getValue() == maxValueInCycles) {
				keyOfCycles = entry.getKey() + 5;
			}
		}
		System.out.println("������������ ���������� ������: " + maxValueInCycles + " � �����: " + keyOfCycles);
	}

}