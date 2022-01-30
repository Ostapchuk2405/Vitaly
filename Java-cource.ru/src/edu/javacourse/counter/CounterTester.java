package edu.javacourse.counter;

public class CounterTester {

	public static void main(String[] args) throws InterruptedException {

		Counter counter = new Counter();

		long time1 = System.currentTimeMillis();

		for (int i = 0; i < 200; i++) {
			CounterThread ct = new CounterThread(counter);
			ct.start();

		}
		Thread.sleep(1000);
		System.out.println("Counter: " + counter.getCounter());

		long time2 = System.currentTimeMillis();

		System.out.println("Общее времявыполнения: " + (time2 - time1 - 1000) + " милисекунд");
	}

}
