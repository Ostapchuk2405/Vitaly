package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class MathLoop {

	/*
	 * Математическая задача современная. Число x расчитывается по формуле: если
	 * чётное, то - х / 2 если нечётное, то - 3х + 1. Дальше результат операции
	 * повторяет вычисление ихсодя из формулы, под которую подходит Эти формулы
	 * повторяются Учёные пытаются найти то самое число, которое будет стремится к
	 * бесконечности
	 */

//	Пока все начальные числа x стремятся к циклу (4 - 2 - 1)

	public static void main(String[] args) {

		System.out.println("Введи число для данной задачи: ");

		ArrayList<Integer> maxes = new ArrayList<Integer>();
		ArrayList<Integer> cycles = new ArrayList<Integer>();

		HashMap<Integer, Integer> numbersMaxPeak = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> numbersMaxCycles = new HashMap<Integer, Integer>();

		for (int index = 0; index < 100000; index++) {
			int cycle = 0;
			int maxX = 0;
			int number = index + 5;

			System.out.println();
			System.out.println("***** Число " + number + " *****");

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

			System.out.println("Количество циклов = " + cycle);
			System.out.println("Максимальное производное = " + maxX);

			maxes.add(maxX);
			cycles.add(cycle);

			numbersMaxPeak.put(index, maxX);
			numbersMaxCycles.put(index, cycle);
		}

		int numberWithMaxDerivative = maxes.indexOf(Collections.max(maxes));
		// Выводим максимальную производную из чисел данного диапозона
		System.out.println();
		System.out.println("***** CONCLUSION *****");
		System.out.println("Максимальное производного из чисел данного диапозона: [ " + Collections.max(maxes) + " ]");
//		Выводим максимальное количество циклов у числа
		System.out.println("Максимальное количество циклов: [ " + Collections.max(cycles) + " ]");
		System.out.println();

//		Здесь хочу отобразить при каком числе будет максимальное производное в цикле
		System.out.println("Максимальное производное у числа: " + numberWithMaxDerivative + " + 5");
		System.out
				.println("Максимальное количество циклов у числа: " + cycles.indexOf(Collections.max(cycles)) + " + 5");
		System.out.println();

		int numberOfKey = 0;
		int maxValueInMap = (Collections.max(numbersMaxPeak.values()));
		for (Entry<Integer, Integer> entry : numbersMaxPeak.entrySet()) {
			if (entry.getValue() == maxValueInMap) {
				numberOfKey = entry.getKey() + 5;
			}
		}
		System.out.println("Максимальная производная: " + maxValueInMap + " у числа: " + numberOfKey);

		int keyOfCycles = 0;
		int maxValueInCycles = (Collections.max(numbersMaxCycles.values()));
		for (Entry<Integer, Integer> entry : numbersMaxCycles.entrySet()) {
			if (entry.getValue() == maxValueInCycles) {
				keyOfCycles = entry.getKey() + 5;
			}
		}
		System.out.println("Максимальное количество циклов: " + maxValueInCycles + " у числа: " + keyOfCycles);
	}

}