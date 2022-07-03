/**
 * 
 */
package part15StringProcessing;

/**
 * Применение reverse() для обращения порядка StringBuffer
 * @author Shiltd
 *
 */
class ReverseDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		StringBuffer s = new StringBuffer("abcdef");
		System.out.println(s);
		
		s.reverse();
		System.out.println(s);
	}

}
