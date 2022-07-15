/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.StringTokenizer;

/**
 * Демонстрация применения StringTokenizer
 * 
 * @author Schiltd
 * 
 *
 */
class StringTokenizerDemo {

	/**
	 * @param args
	 */
	static String in = "title=Java: The Complete Reference;" + "author=Schiltd;" + "publisher=McGraw-Hill;"
			+ "copyright=2011";

	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer(in, "=;");
		
		while (st.hasMoreTokens()) {
			String key = st.nextToken();
			String val = st.nextToken();
			System.out.println(key + "\t" + val);

		}
	}

}
