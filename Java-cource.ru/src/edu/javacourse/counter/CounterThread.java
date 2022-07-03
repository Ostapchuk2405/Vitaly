package edu.javacourse.counter;

public class CounterThread extends Thread {

	private static long counter = Counter.getCounter();

	public CounterThread(long counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			Counter.increaseCounter();
		}

	}

	public static void main(String[] args) throws InterruptedException {

		long time1 = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			new CounterThread(counter).start();
		}
		Thread.sleep(1000);
		System.out.println();
		System.out.println("Counter = " + Counter.getCounter());
		long time2 = System.currentTimeMillis();
		System.out.println();
		System.out.println("Operation time = " + (time2 - time1 - 1000) + " milliseconds");
	}
}
