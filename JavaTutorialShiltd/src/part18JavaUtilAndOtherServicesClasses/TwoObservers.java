/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.*;

/**
 * Объект может наблюдаться одним или более наблюдателями.
 * 
 * @author Schiltd
 *
 */

//	первый класс-наблюдатель
class Watcher1 implements Observer {

	@Override
	public void update(Observable obj, Object arg) {
		System.out.println("update() вызван, count равен " + ((Integer) arg).intValue());
	}

}

//	второй класс-наблюдатель
class Watcher2 implements Observer {

	@Override
	public void update(Observable obj, Object arg) {
//		по окончанию выдать звуковой сигнал
		if (((Integer) arg).intValue() == 0)
			System.out.println("Готово" + '\7');
	}

}

//	наблюдаемый класс
class BeingWatched extends Observable {
	void counter(int period) {
		for (; period >= 0; period--) {
			setChanged();
			notifyObservers(new Integer(period));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Ожидание прервано.");
			}
		}
	}
}

class TwoObservers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BeingWatched observed = new BeingWatched();
		Watcher1 observing1 = new Watcher1();
		Watcher2 observing2 = new Watcher2();

//		добавить оба наблюдателя
		observed.addObserver(observing1);
		observed.addObserver(observing2);
		observed.counter(10);
	}

}
