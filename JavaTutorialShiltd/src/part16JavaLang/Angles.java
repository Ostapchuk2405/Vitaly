/**
 * 
 */
package part16JavaLang;

/**
 * ������������ ���������� toDegrees() & toRadians()
 * 
 * @author Shiltd
 *
 */
class Angles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double theta = 120.0;
		System.out.println(theta + " �������� ����� " + Math.toRadians(theta) + " " + " ������.");

		theta = 1.312;
		System.out.println(theta + " ������ ����� " + Math.toDegrees(theta) + " ��������.");
	}

}
