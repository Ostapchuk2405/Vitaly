/**
 * 
 */
package part13InOutAppletOther.applets;

/**
 * ������������ ������������� ��������� instanceOf
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
			System.out.println("� ���� ��������� �");
		}
		if (b instanceof B) {
			System.out.println("b ���� ��������� B");
		}
		if (c instanceof C) {
			System.out.println("c ���� ��������� C");
		}
		if (c instanceof A) {
			System.out.println("� ����� ���� ������� � �");
		}
		if (a instanceof C) {
			System.out.println("� ����� ���� ������� � �");
		}

		System.out.println();

		A ob;
		ob = d;
		System.out.println("ob ������ ��������� �� d");

		if (ob instanceof D) {
			System.out.println("ob ���� ��������� D");
		}

		System.out.println();
		ob = c;
		System.out.println("ob ������ ��������� �� �");

		if (ob instanceof D) {
			System.out.println("ob ����� ���� ������� � D");
		} else {
			System.out.println("ob �� ����� ���� ������� � D");
		}

		if (ob instanceof A) {
			System.out.println("ob ����� ���� ������� � �");
		}

//		��� ������� ����� ���� ��������� � Object
		if (a instanceof Object) {
			System.out.println("a ����� ���� ������� � Object");
		}
		if (b instanceof Object) {
			System.out.println("b ����� ���� ������� � Object");
		}
		if (c instanceof Object) {
			System.out.println("c ����� ���� ������� � Object");
		}
		if (d instanceof Object) {
			System.out.println("d ����� ���� ������� � Object");
		}
	}

}
