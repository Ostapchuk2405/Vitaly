/**
 * 
 */
package part15StringProcessing;

/**
 * Создание строки из подмножества символьного массива
 * @author Shiltd
 *
 */
class SubStringCons {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		byte abcii[] = {65,66,67,68,69,70};
		String s1 = new String(abcii);
		System.out.println(s1);
		String s2 = new String(abcii, 2, 3);
		System.out.println(s2);
	}

}
