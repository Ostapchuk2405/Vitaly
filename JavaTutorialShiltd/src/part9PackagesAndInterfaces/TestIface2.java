/**
 * 
 */
package part9PackagesAndInterfaces;

/**
 * @author Shiltd
 *
 */
class TestIface2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Callback c = new Client();
		AnotherClient ob = new AnotherClient();

		c.callback(42);
		c = ob;
		c.callback(42);
	}

}
