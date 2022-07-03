package edu.javacourse.counter;

public class Counter {

	private static long counter = 0L;

	public synchronized static long increaseCounter() {
		return counter++;
	}

	public static long getCounter() {
		return counter;
	}

}
