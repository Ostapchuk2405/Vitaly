/**
 * 
 */
package part11MultiThreading;

/**
 * ������������ � ������������� ������ ����������� ��������
 * 
 * @author Shiltd
 *
 */

class NewThread4 implements Runnable {

	String name;
	Thread t;
	boolean suspendFlag;

	NewThread4(String threadName) {
		name = threadName;
		t = new Thread(this, name);
		System.out.println("����� �����: " + t);
		suspendFlag = false;
		t.start();
	}

	@Override
	public void run() {

		try {
			for (int i = 15; i > 0; i--) {
				System.out.println(name = ": " + i);
				Thread.sleep(200);
				synchronized (this) {
					while (suspendFlag) {
						wait();
					}
				}
			}
		} catch (InterruptedException e) {
			System.out.println(name + " �������.");
		}

		System.out.println(name + " ��������.");
	}

	synchronized void mysuspend() {
		suspendFlag = true;
	}

	synchronized void myresume() {
		suspendFlag = false;
		notify();
	}
}

class SuspendResume {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		NewThread4 ob1 = new NewThread4("����");
		NewThread4 ob2 = new NewThread4("���");

		try {
			Thread.sleep(1000);
			ob1.mysuspend();
			System.out.println("������������ ������ ����");
			Thread.sleep(1000);
			ob1.myresume();
			System.out.println("������������� ������ ����");
			ob2.mysuspend();
			System.out.println("������������ ������ ���");
			Thread.sleep(1000);
			ob2.myresume();
			System.out.println("������������� ������ ���");
		} catch (InterruptedException e) {
			System.out.println("������� ����� �������");
		}

		try {
			System.out.println("�������� ���������� �������");
			ob1.t.join();
			ob2.t.join();
		} catch (InterruptedException e) {
			System.out.println("������� ����� �������");
		}
		System.out.println("������� ����� ��������");
	}

}
