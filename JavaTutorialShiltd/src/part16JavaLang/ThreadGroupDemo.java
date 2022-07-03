/**
 * 
 */
package part16JavaLang;

/**
 * Демонстрация применения групп потоков.
 * 
 * @author Shiltd
 *
 */

class NewThread extends Thread {
	boolean suspendFlag;

	NewThread(String threadName, ThreadGroup tgOb) {
		super(tgOb, threadName);
		System.out.println("Новый поток: " + this);
		suspendFlag = false;
		start(); // запуск потока
	}

//	точка входа потока
	@Override
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(getName() + ": " + i);
				Thread.sleep(1000);
				synchronized (this) {
					while (suspendFlag) {
						wait();
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Исключение в " + getName());
		}
		System.out.println(getName() + " завершается.");
	}

	synchronized void mySuspend() {
		suspendFlag = true;
	}

	synchronized void myResume() {
		suspendFlag = false;
		notify();
	}
}

class ThreadGroupDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ThreadGroup groupA = new ThreadGroup("Группа А");
		ThreadGroup groupB = new ThreadGroup("Группа В");

		NewThread ob1 = new NewThread("Один", groupA);
		NewThread ob2 = new NewThread("Два", groupA);
		NewThread ob3 = new NewThread("Три", groupB);
		NewThread ob4 = new NewThread("Четыре", groupB);

		System.out.println("\nВывод из list():");
		groupA.list();
		groupB.list();
		System.out.println();

		System.out.println("Прерывается группа А");
		Thread tga[] = new NewThread[groupA.activeCount()];
		groupA.enumerate(tga);

		for (int i = 0; i < tga.length; i++) {
			((NewThread) tga[i]).mySuspend(); // приостановить каждый поток
		}

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			System.out.println("Главный поток прерван.");
		}

		System.out.println("Возобновление Group A");

		for (int i = 0; i < tga.length; i++) {
			((NewThread) tga[i]).myResume(); // возобновить все потоки в группе
		}

//		ожидать завершения потоков
		try {
			System.out.println("Ожидание остановки потоков.");
			ob1.join();
			ob2.join();
			ob3.join();
			ob4.join();
		} catch (Exception e) {
			System.out.println("Исключение в основном потоке.");
		}

		System.out.println("Основной поток завершён.");
	}

}
