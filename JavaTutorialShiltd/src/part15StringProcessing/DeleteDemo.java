/**
 * 
 */
package part15StringProcessing;

/**
 * Демонстрация применения delete() & deleteCharAt()
 * @author Shiltd
 *
 */
class DeleteDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("This is a test");
		System.out.println(sb);
		
		sb.delete(4, 7);
		System.out.println(sb);
		
		sb.deleteCharAt(0);
		System.out.println(sb);
	}

}
