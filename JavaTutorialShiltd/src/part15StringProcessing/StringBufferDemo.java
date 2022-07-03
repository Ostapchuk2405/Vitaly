/**
 * 
 */
package part15StringProcessing;

/**
 * Сравнение методов length() & capacity() класса StringBuffer
 * 
 * @author Shiltd
 *
 */
class StringBufferDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("buffer = " + sb);
		System.out.println("length = " + sb.length());
		System.out.println("capacity = " + sb.capacity());
	}

}
