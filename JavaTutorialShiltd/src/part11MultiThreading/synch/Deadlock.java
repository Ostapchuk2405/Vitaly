/**
 * 
 */
package part11MultiThreading.synch;

/**
 * ������ �������� ����������
 * 
 * @author Shiltd
 *
 */

class A {
	synchronized void foo(B b) {
		String name = Thread.currentThread().getName();

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("A �������");
		}
		System.out.println(name + " �������� ������� B.last()");
		b.last();
	}

	synchronized void last() {
		System.out.println("������ A.last");
	}
}

class B {

	synchronized void bar(A a) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " ����� � B.bar");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("� �������");
		}

		System.out.println(name + " �������� ������� A.last");
	}

	synchronized void last() {
		// TODO Auto-generated method stub

	}

}

class Deadlock implements Runnable {

	A a = new A();
	B b = new B();

	Deadlock() {
		Thread.currentThread().setName("MainThread");
		Thread t = new Thread(this, "RacingThread");
		t.start();

		a.foo(b);
		System.out.println("����� � ������� �����");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Deadlock();
	}

	@Override
	public void run() {
		b.bar(a);
		System.out.println("����� � ������ �����");

	}

}
