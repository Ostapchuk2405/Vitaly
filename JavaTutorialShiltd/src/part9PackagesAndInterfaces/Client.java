/**
 * 
 */
package part9PackagesAndInterfaces;

/**
 * Реализует интерфейс Callback
 * 
 * @author Shiltd
 *
 */
public class Client implements Callback {

	public void callback(int param) {
		System.out.println("Метод callback, вызванный со значением " + param);
	}

	void nonIfaceMeth() {
		System.out.println("Классы, которые реализуют интерфейсы могут определять также и ждругие классы.");
	}
}
