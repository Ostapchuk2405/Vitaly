/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.*;

/**
 * ������������ ���������� ������ Observable � ���������� Observer
 * 
 * @author Schiltd
 *
 */

//	�����-�����������
class Watcher implements Observer {

	@Override
	public void update(Observable obj, Object arg) {
		System.out.println("update() ������, count ����� " + ((Integer) arg).intValue());

	}

}

//	��� ����������� �����
class BeingWatching extends Observable {
	void counter(int period) {
		for (; period >= 0; period--) {
			setChanged();
			notifyObservers(new Integer(period));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("�������� ��������.");
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

//		�������� ����������� � ������ ������������ ������������ �������
		observed.addObserver(observing);
		observed.counter(10);
	}

}
