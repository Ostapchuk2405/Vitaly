/**
 * 
 */
package part12EnumAutoboxAnnotation.autobox;

/**
 * 
 * @author Shiltd
 *
 */
class AutoBox4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Integer iOb = 100;
		Double dOb = 98.6;

		dOb = dOb + iOb;
		System.out.println("dOb после выражения: " + dOb);
	}

}
