/**
 * 
 */
package part8Inheritance;

/**
 * ���������� ��������� ����� super ��� �������������� �������� �����
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
		System.out.println("i � �����������: " + super.i);
		System.out.println("i � ���������: " + i);
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
