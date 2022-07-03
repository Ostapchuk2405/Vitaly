/**
 * 
 */
package part7ClassesAndMethodsMore;

/**
 * Демонстрация использования внутреннего класса
 * 
 * @author Shiltd
 *
 */

class Outer {
	int outer_x = 100;

	void test() {
		Inner inner = new Inner();
		inner.display();
	}

	class Inner {
		void display() {
			System.out.println("вывод: outer_x = " + outer_x);

		}
	}
}

class InnerClassDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Outer outer = new Outer();
		outer.test();
	}

}
