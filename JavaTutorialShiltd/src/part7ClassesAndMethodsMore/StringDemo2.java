/**
 * 
 */
package part7ClassesAndMethodsMore;

/**
 * ������������ ��������� ������� ������ String
 * 
 * @author Shiltd
 *
 */
class StringDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String strOb1 = "������ ������";
		String strOb2 = "������ ������";
		String strOb3 = strOb1;

		System.out.println("������ strOb1: " + strOb1.length());
		System.out.println("������ � �������� 3 � strOb1: " + strOb1.charAt(3));

		if (strOb1.equals(strOb2))
			System.out.println("strOb1 == strOb2");
		else
			System.out.println("strOb1 != strOb2");

		if (strOb1.equals(strOb3))
			System.out.println("strOb1 == strOb3");
		else
			System.out.println("strOb1 != strOb3");
	}

}
