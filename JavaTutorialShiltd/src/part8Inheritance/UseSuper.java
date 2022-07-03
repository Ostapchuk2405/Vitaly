/**
 * 
 */
package part8Inheritance;

/**
 * ѕрименение ключевого слова super дл€ предотвращени€ сокрыти€ имени
 * 
 * @author Shiltd
 *
 */

class C {
	int i;
}

class D extends C {
	int i;

	D(int a, int b) {
		super.i = a;
		i = b;
	}

	void show() {
		System.out.println("i в суперклассе: " + super.i);
		System.out.println("i в подклассе: " + i);
	}
}

class UseSuper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		D subOb = new D(1, 2);

		subOb.show();

	}

}
