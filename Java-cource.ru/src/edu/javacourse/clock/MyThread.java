package edu.javacourse.clock;

public class MyThread extends Thread {

	private SimpleClock clock;

	public MyThread(SimpleClock clock) {

		this.clock = clock;
	}

	@Override
	public void run() {
		while (true) {
			clock.setTime();
			try {
				clock.setTime();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
