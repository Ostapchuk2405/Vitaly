/**
 * 
 */
package part7ClassesAndMethodsMore;

/**
 * Элементарные типы передаются по значению
 * 
 * @author Shiltd
 *
 */

class Test2 {
	void meth(int i, int j) {
		i *= 2;
		j /= 2;
	}
}

 class CallByValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Test2 ob = new Test2();

		int a = 15, b = 20;
		System.out.println("a & b перед вызовом: " + a + " " + b);

		ob.meth(a, b);
//		не оказывает никакого влияния вне метода
		System.out.println("a & b после вызова: " + a + " " + b);
	}

}
