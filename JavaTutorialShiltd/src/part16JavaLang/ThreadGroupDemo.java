/**
 * 
 */
package part16JavaLang;

/**
 * ������������ ���������� ����� �������.
 * 
 * @author Shiltd
 *
 */

class NewThread extends Thread {
	boolean suspendFlag;

	NewThread(String threadName, ThreadGroup tgOb) {
		super(tgOb, threadName);
		System.out.println("����� �����: " + this);
		suspendFlag = false;
		start(); // ������ ������
	}

//	����� ����� ������
	@Override
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(getName() + ": " + i);
				Thread.sleep(1000);
				synchronized (this) {
					while (suspendFlag) {
						wait();
					}
				}
			}
		} catch (Exception e) {
			System.out.println("���������� � " + getName());
		}
		System.out.println(getName() + " �����������.");
	}

	synchronized void mySuspend() {
		suspendFlag = true;
	}

	synchronized void myResume() {
		suspendFlag = false;
		notify();
	}
}

class ThreadGroupDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ThreadGroup groupA = new ThreadGroup("������ �");
		ThreadGroup groupB = new ThreadGroup("������ �");

		NewThread ob1 = new NewThread("����", groupA);
		NewThread ob2 = new NewThread("���", groupA);
		NewThread ob3 = new NewThread("���", groupB);
		NewThread ob4 = new NewThread("������", groupB);

		System.out.println("\n����� �� list():");
		groupA.list();
		groupB.list();
		System.out.println();

		System.out.println("����������� ������ �");
		Thread tga[] = new NewThread[groupA.activeCount()];
		groupA.enumerate(tga);

		for (int i = 0; i < tga.length; i++) {
			((NewThread) tga[i]).mySuspend(); // ������������� ������ �����
		}

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			System.out.println("������� ����� �������.");
		}

		System.out.println("������������� Group A");

		for (int i = 0; i < tga.length; i++) {
			((NewThread) tga[i]).myResume(); // ����������� ��� ������ � ������
		}

//		������� ���������� �������
		try {
			System.out.println("�������� ��������� �������.");
			ob1.join();
			ob2.join();
			ob3.join();
			ob4.join();
		} catch (Exception e) {
			System.out.println("���������� � �������� ������.");
		}

		System.out.println("�������� ����� ��������.");
	}

}
