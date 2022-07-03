/**
 * 
 */
package part11MultiThreading.synch;

/**
 * ������������ ��������������������� call
 * 
 * @author Shiltd
 *
 */
class Synch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Callme target = new Callme();
		Caller ob1 = new Caller(target, "����� ����������");
		Caller ob2 = new Caller(target, "� ������������������");
		Caller ob3 = new Caller(target, "���!");

//		�������� ���������� ������
		try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch (InterruptedException e) {
			System.out.println("��������");
		}
	}

}
