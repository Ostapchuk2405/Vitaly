/**
 * 
 */
package part8Inheritance;

/**
 * Простой пример наследования
 * 
 * @author Shiltd
 *
 */

// Создание суперкласса
class A {
	int i, j;

	void showij() {
		System.out.println("i & j: " + i + " " + j);
	}
}

class B extends A {
	int k;

	void showk() {
		System.out.println("k: " + k);
	}

	void sum() {
		System.out.println("i+j+k: " + (i + j + k));
	}
}

 class SimpleInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		A superOb = new A();
		B subOb = new B();

		superOb.i = 10;
		superOb.j = 20;
		System.out.println("Содержимое superOb: ");
		superOb.showij();
		System.out.println();

//		Подкласс имеет доступ ко всем открытым членам своего суперкласса.
		subOb.i = 7;
		subOb.j = 8;
		subOb.k = 9;
		System.out.println("Содержимое subOb: ");
		subOb.showij();
		subOb.showk();

		System.out.println();
		System.out.println("Сумма i, j, k в subOb:");
		subOb.sum();
	}

}
