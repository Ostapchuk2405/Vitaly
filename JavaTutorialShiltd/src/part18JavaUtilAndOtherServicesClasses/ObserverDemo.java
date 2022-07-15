/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.*;

/**
 * Демонстрация применения класса Observable и интерфейса Observer
 * 
 * @author Schiltd
 *
 */

//	Класс-наблюдатель
class Watcher implements Observer {

	@Override
	public void update(Observable obj, Object arg) {
		System.out.println("update() вызван, count равен " + ((Integer) arg).intValue());

	}

}

//	Это наблюдаемый класс
class BeingWatching extends Observable {
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

class ObserverDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BeingWatching observed = new BeingWatching();
		Watcher observing = new Watcher();

//		добавить наблюдателя в список наблюдателей наблюдаемого объекта
		observed.addObserver(observing);
		observed.counter(10);
	}

}
