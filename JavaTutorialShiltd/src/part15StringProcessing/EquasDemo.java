/**
 * 
 */
package part15StringProcessing;

/**
 * ������������ ���������� equals() & equalsIgnoreCase()
 * @author Shiltd
 *
 */
class EquasDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s1 = "������";
		String s2 = "������";
		String s3 = "����";
		String s4 = "������";
		
		System.out.println(s1 + " ������������ " + s2 + " -> " + s1.equals(s2));
		System.out.println(s1 + " ������������ " + s3 + " -> " + s1.equals(s3));
		System.out.println(s1 + " ������������ " + s4 + " -> " + s1.equals(s4));
		System.out.println(s1 + " ������������, ��������� ������� " + s4 + " -> " + s1.equalsIgnoreCase(s4));
	}

}
