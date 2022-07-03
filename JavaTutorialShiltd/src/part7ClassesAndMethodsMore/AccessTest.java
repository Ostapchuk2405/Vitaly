/**
 * 
 */
package part7ClassesAndMethodsMore;

/**
 * Эта программа демонстрирует различие между модификаторами доступа
 * 
 * @author Shiltd
 *
 */

class Test5 {
	int a;
	public int b;
	private int c;

	void setc(int i) {
		c = i;
	}

	int getc() {
		return c;
	}
}

 class AccessTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Test5 ob = new Test5();

//		Эти операторы правельны
		ob.a = 10;
		ob.b = 20;

//		ob.c = 100 // Ошибка!

		ob.setc(100);
		System.out.println("a, b, c: " + ob.a + " " + ob.b + " " + ob.getc());
	}

}
