/**
 * 
 */
package part11MultiThreading;

/**
 * ������������ ��������� �������
 * 
 * @author Shiltd
 *
 */
class MultiThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		new NewThread2("����");
		new NewThread2("���");
		new NewThread2("���");

		try {
//			�������� ���������� ������ �������
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("������� ����� �������");
		}
		System.out.println("������� ����� ��������");
	}

}
