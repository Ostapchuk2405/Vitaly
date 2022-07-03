/**
 * 
 */
package part11MultiThreading;

/**
 * Создание множества потоков
 * 
 * @author Shiltd
 *
 */
class NewThread2 implements Runnable {

	String name;
	Thread t;

	public NewThread2(String threadName) {
		name = threadName;
		t = new Thread(this, name);
		System.out.println("Новый поток: " + t);
		t.start();
	}

//	Входная точка потока
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(name + " прерван");
		}
		System.out.println(name + " завершён");
	}

}
