/**
 * 
 */
package part11MultiThreading;

/**
 * Демонстрация потока MyThread1 с использованием расширения Thread
 * 
 * @author Shiltd
 *
 */
class ExtendThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		new NewThread1();

		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Главный поток: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Главный поток прерван");
		}
		System.out.println("Главный поток завершён");
	}

}
