/**
 * 
 */
package part11MultiThreading;

/**
 * Управление главным потоком
 * 
 * @author Shiltd
 *
 */
class CurrentThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Thread t = Thread.currentThread();

		System.out.println("Текущий поток: " + t);
		t.setName("My Thread");

		System.out.println("После изменения имени: " + t);

		try {
			for (int n = 5; n > 0; n--) {
				System.out.println(n);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Главный поток прерван");
		}
	}

}
