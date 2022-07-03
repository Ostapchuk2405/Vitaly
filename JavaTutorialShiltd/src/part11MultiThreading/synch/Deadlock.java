/**
 * 
 */
package part11MultiThreading.synch;

/**
 * Пример взаимной блокировки
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
			System.out.println("A прерван");
		}
		System.out.println(name + " пытается вызвать B.last()");
		b.last();
	}

	synchronized void last() {
		System.out.println("Внутри A.last");
	}
}

class B {

	synchronized void bar(A a) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " вошёл в B.bar");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("В прерван");
		}

		System.out.println(name + " пытается вызвать A.last");
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
		System.out.println("Назад в главный поток");
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
		System.out.println("Назад в другой поток");

	}

}
