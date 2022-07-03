/**
 * 
 */
package part11MultiThreading.synch;

/**
 * Демонстрация синхронизированного потока Caller c методом call
 * 
 * @author Shiltd
 *
 */
class Synch1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Callme target = new Callme();
		CallerSynch ob1 = new CallerSynch(target, "Добро пожаловать");
		CallerSynch ob2 = new CallerSynch(target, "в синхронизированный");
		CallerSynch ob3 = new CallerSynch(target, "мир!");

//		Ожидание завершения потока
		try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Прервано");
		}

	}

}
