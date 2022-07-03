/**
 * 
 */
package part11MultiThreading;

/**
 * Создание второго потока расширением Thread
 * 
 * @author Shiltd
 *
 */
class NewThread1 extends Thread {

	public NewThread1() {
		// Создать новый второй поток
		super("Демонстрационный поток");
		System.out.println("Дочерний поток: " + this);
		start();
	}

//	Точка входа второго потока
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Дочерний поток: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Дочерний поток прерван");
		}
		System.out.println("Дочерний поток завершён");
	}

}
