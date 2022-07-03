/**
 * 
 */
package part9PackagesAndInterfaces;

/**
 * 
 * @author Shiltd
 *
 */
class TestIface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Callback c = new Client();
		c.callback(42);
	}

}
