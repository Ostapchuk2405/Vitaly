/**
 * 
 */
package part11MultiThreading;

/**
 * ������������
 * 
 * @author Shiltd
 *
 */
class JoinDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		NewThread3 ob1 = new NewThread3("����");
		NewThread3 ob2 = new NewThread3("���");
		NewThread3 ob3 = new NewThread3("���");

		System.out.println("����� ���� �������: " + ob1.t.isAlive());
		System.out.println("����� ��� �������: " + ob2.t.isAlive());
		System.out.println("����� ��� �������: " + ob3.t.isAlive());

//		������� ���������� �������
		try {
			System.out.println("�������� ���������� �������.");
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch (InterruptedException e) {
			System.out.println("������� ����� �������");
		}

		System.out.println("����� ���� �������: " + ob1.t.isAlive());
		System.out.println("����� ��� �������: " + ob2.t.isAlive());
		System.out.println("����� ��� �������: " + ob3.t.isAlive());

		System.out.println("������� ����� ��������.");
	}

}
