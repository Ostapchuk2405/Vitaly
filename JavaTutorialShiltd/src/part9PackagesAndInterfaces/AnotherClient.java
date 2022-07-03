/**
 * 
 */
package part9PackagesAndInterfaces;

/**
 * Ещё одна реализация интерфейса Callback
 * @author Shiltd
 *
 */
class AnotherClient implements Callback {

	public void callback(int param) {

		System.out.println("Ещё одна версия Callback");
		System.out.println("param в квадрате равно " + (param*param));
	}

	
}
