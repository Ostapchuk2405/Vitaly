/**
 * 
 */
package part15StringProcessing;

/**
 * ������������ toUpperCase() & toLowerCase()
 * 
 * @author Shiltd
 *
 */
class ChangeCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s = "��� ����";
		System.out.println("�������� ������: " + s);
		String upper = s.toUpperCase();
		String lower = s.toLowerCase();
		System.out.println("������� �������: " + upper);
		System.out.println("������ �������: " + lower);
	}

}
