/**
 * 
 */
package part11MultiThreading;

/**
 * Демонстрация множества потоков
 * 
 * @author Shiltd
 *
 */
class MultiThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		new NewThread2("Один");
		new NewThread2("Два");
		new NewThread2("Три");

		try {
//			Ожидание завершения других потоков
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Главное поток прерван");
		}
		System.out.println("Главный поток завершён");
	}

}
