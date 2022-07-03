/**
 * 
 */
package part15StringProcessing;

/**
 * Использование конкатенации во избежании длинных строк
 * 
 * @author Shiltd
 *
 */
class ConCat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String longStr = "Это может быть " + "очень длинная строка, которую следует "
				+ "перенести. Но конкатенация позволяет " + "предотвратить это.";
		System.out.println(longStr);
	}

}
