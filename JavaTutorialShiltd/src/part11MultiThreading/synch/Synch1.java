/**
 * 
 */
package part11MultiThreading.synch;

/**
 * ������������ ������������������� ������ Caller c ������� call
 * 
 * @author Shiltd
 *
 */
class Synch1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Callme target = new Callme();
		CallerSynch ob1 = new CallerSynch(target, "����� ����������");
		CallerSynch ob2 = new CallerSynch(target, "� ������������������");
		CallerSynch ob3 = new CallerSynch(target, "���!");

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
