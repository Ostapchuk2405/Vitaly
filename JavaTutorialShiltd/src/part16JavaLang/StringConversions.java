/**
 * 
 */
package part16JavaLang;

/**
 * �������������� ����� � ��������, ����������������� � ������������ ������
 * 
 * @author Shiltd
 *
 */
class StringConversions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num = 19648;

		System.out.println(num + " � �������� �������: " + Integer.toBinaryString(num));
		System.out.println(num + " � ������������ �������: " + Integer.toOctalString(num));
		System.out.println(num + " � ����������������� �������: " + Integer.toHexString(num));
	}

}
