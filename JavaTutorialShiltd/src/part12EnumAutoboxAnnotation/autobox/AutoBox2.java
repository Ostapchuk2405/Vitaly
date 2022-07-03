/**
 * 
 */
package part12EnumAutoboxAnnotation.autobox;

/**
 * Принять параметры интеджер и вернуть int
 * 
 * @author Shiltd
 *
 */
class AutoBox2 {

	/**
	 * @param args
	 */

	static int m(Integer v) {
		return v;
	}

	public static void main(String[] args) {

		Integer iOb = m(100);

		System.out.println(iOb);

	}

}
