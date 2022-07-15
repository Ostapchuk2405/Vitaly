/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.*;

/**
 * ������������ ���������� Timer & TimerTask
 * 
 * @author Schiltd
 *
 */

class MyTimerTask extends TimerTask {

	@Override
	public void run() {
		System.out.println("������� ������� �����������.");
	}

}

class TimerTaskTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MyTimerTask myTask = new MyTimerTask();
		Timer myTimer = new Timer();

//		������������� ��������� ����� � �������, ����� ��������� ������ ����������
		myTimer.schedule(myTask, 1000, 500);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			myTimer.cancel();
		}
	}

}
