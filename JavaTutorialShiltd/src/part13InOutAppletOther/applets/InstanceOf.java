/**
 * 
 */
package part13InOutAppletOther.applets;

/**
 * Демонстрация использования оператора instanceOf
 * 
 * @author Shiltd
 *
 */

class A {
	int i, j;
}

class B {
	int i, j;
}

class C extends A {
	int K;
}

class D extends A {
	int k;
}

class InstanceOf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();

		if (a instanceof A) {
			System.out.println("а есть экземпляр А");
		}
		if (b instanceof B) {
			System.out.println("b есть экземпляр B");
		}
		if (c instanceof C) {
			System.out.println("c есть экземпляр C");
		}
		if (c instanceof A) {
			System.out.println("с может быть приведён к А");
		}
		if (a instanceof C) {
			System.out.println("а может быть приведён к С");
		}

		System.out.println();

		A ob;
		ob = d;
		System.out.println("ob теперь ссылается на d");

		if (ob instanceof D) {
			System.out.println("ob есть экземпляр D");
		}

		System.out.println();
		ob = c;
		System.out.println("ob теперь ссылается на с");

		if (ob instanceof D) {
			System.out.println("ob может быть приведён к D");
		} else {
			System.out.println("ob не может быть приведён к D");
		}

		if (ob instanceof A) {
			System.out.println("ob может быть приведён к А");
		}

//		Все объёкты могут быть приведены к Object
		if (a instanceof Object) {
			System.out.println("a может быть приведён к Object");
		}
		if (b instanceof Object) {
			System.out.println("b может быть приведён к Object");
		}
		if (c instanceof Object) {
			System.out.println("c может быть приведён к Object");
		}
		if (d instanceof Object) {
			System.out.println("d может быть приведён к Object");
		}
	}

}
