/**
 * 
 */
package part15StringProcessing;

/**
 * Демонстрация применения append()
 * @author Shiltd
 *
 */
class InsertDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("I Java!");
		
		sb.insert(2, "like ");
		System.out.println(sb);
	}

}
