/**
 * 
 */
package part15StringProcessing;

/**
 * ������������ charAt() & setCharAt()
 * 
 * @author Shiltd
 *
 */
class SetCharAtDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("����� ��  = " + sb);
		System.out.println("�� charAt(1) = " + sb.charAt(1));

		sb.setCharAt(1, 'i');
		sb.setLength(2);
		System.out.println("����� ����� = " + sb);
		System.out.println("����� charAt(1) = " + sb.charAt(1));
	}

}
