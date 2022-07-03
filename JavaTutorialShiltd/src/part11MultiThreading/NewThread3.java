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
class NewThread3 implements Runnable {

	String name;
	Thread t;

	public NewThread3(String threadName) {
		name = threadName;
		t = new Thread(this, name);
		System.out.println("����� �����: " + t);
		t.start();
	}

	@Override
	public void run() {

		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(name + ": " + t);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(name + " �������");
		}
		System.out.println(name + " ��������");
	}

}
