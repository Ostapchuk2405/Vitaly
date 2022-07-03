/**
 * 
 */
package part13InOutAppletOther.applets;

/**
 * Пример использования машинно-зависимого метода т.е. с других языков
 * программирования
 * 
 * @author Shiltd
 *
 */
public class NativeDemo {

	/**
	 * @param args
	 */

	int i;

	public static void main(String[] args) {

		NativeDemo ob = new NativeDemo();

		ob.i = 10;
		System.out.println("Это ob.i перед вызовом машинно-зависимого метода: " + ob.i);

		ob.test(); // Вызов native метода
		System.out.println("Это ob.i после вызовом машинно-зависимого метода: " + ob.i);

	}
// Объявление машинно-зависимого метода
	public native void test();

	static {
		System.loadLibrary("NativeDemo");
	}
}
