/**
 * 
 */
package part11MultiThreading;

/**
 * ������������ ������ NewThread
 * 
 * @author Shiltd
 *
 */
class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		new NewThread();

		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("������� �����: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("������� ����� �������");
		}
		System.out.println("������ ����� ��������");
	}

}
