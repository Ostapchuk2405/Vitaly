package edu.javacourse.threads;

public class SimpleThreadManager {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread first = new SimpleThread();
			first.start();
		}
	}

}

class SimpleThread extends Thread {

	@Override
	public void run() {
		try {
			long pause = Math.round(Math.random() * 10000);
			Thread.sleep(pause);
			System.out.println("This thread paused for: " + pause);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
