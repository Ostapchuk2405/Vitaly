/**
 * 
 */
package part11MultiThreading;

/**
 * ������������ ������ MyThread1 � �������������� ���������� Thread
 * 
 * @author Shiltd
 *
 */
class ExtendThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		new NewThread1();

		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("������� �����: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("������� ����� �������");
		}
		System.out.println("������� ����� ��������");
	}

}
