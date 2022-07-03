/**
 * 
 */
package part11MultiThreading;

/**
 * Приостановка и возобновление потока современным способом
 * 
 * @author Shiltd
 *
 */

class NewThread4 implements Runnable {

	String name;
	Thread t;
	boolean suspendFlag;

	NewThread4(String threadName) {
		name = threadName;
		t = new Thread(this, name);
		System.out.println("Новый поток: " + t);
		suspendFlag = false;
		t.start();
	}

	@Override
	public void run() {

		try {
			for (int i = 15; i > 0; i--) {
				System.out.println(name = ": " + i);
				Thread.sleep(200);
				synchronized (this) {
					while (suspendFlag) {
						wait();
					}
				}
			}
		} catch (InterruptedException e) {
			System.out.println(name + " прерван.");
		}

		System.out.println(name + " завершён.");
	}

	synchronized void mysuspend() {
		suspendFlag = true;
	}

	synchronized void myresume() {
		suspendFlag = false;
		notify();
	}
}

class SuspendResume {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		NewThread4 ob1 = new NewThread4("Один");
		NewThread4 ob2 = new NewThread4("Два");

		try {
			Thread.sleep(1000);
			ob1.mysuspend();
			System.out.println("Приостановка потока Один");
			Thread.sleep(1000);
			ob1.myresume();
			System.out.println("Возобновление потока Один");
			ob2.mysuspend();
			System.out.println("Приостановка потока Два");
			Thread.sleep(1000);
			ob2.myresume();
			System.out.println("Возобновление потока Два");
		} catch (InterruptedException e) {
			System.out.println("Главный поток прерван");
		}

		try {
			System.out.println("Ожидание завершения потоков");
			ob1.t.join();
			ob2.t.join();
		} catch (InterruptedException e) {
			System.out.println("Главный поток прерван");
		}
		System.out.println("Главный поток завершён");
	}

}
