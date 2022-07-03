/**
 * 
 */
package part12EnumAutoboxAnnotation.autobox;

/**
 * Демонстрация оболочки типа
 * 
 * @author Shiltd
 *
 */
class Wrap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Integer iOb = new Integer(100);
		int i = iOb.intValue();
		System.out.println(i + " " + iOb);
	}

}