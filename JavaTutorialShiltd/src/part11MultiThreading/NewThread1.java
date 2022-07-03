/**
 * 
 */
package part11MultiThreading;

/**
 * �������� ������� ������ ����������� Thread
 * 
 * @author Shiltd
 *
 */
class NewThread1 extends Thread {

	public NewThread1() {
		// ������� ����� ������ �����
		super("���������������� �����");
		System.out.println("�������� �����: " + this);
		start();
	}

//	����� ����� ������� ������
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("�������� �����: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("�������� ����� �������");
		}
		System.out.println("�������� ����� ��������");
	}

}
