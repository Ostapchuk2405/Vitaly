/**
 * 
 */
package part13InOutAppletOther.other;

/**
 * ��������� ������ ���������� �������������� ������������(����������� ������)
 * 
 * @author Shiltd
 *
 */
class Hypot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double side1, side2;
		double hypot;

		side1 = 3.0;
		side2 = 4.0;

//		�������� �� ��, ��� sqrt() & pow() ������ ���� ���������������� ������ �� ������ - Math.
		hypot = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

		System.out.println("���� ����� ������ " + side1 + " � " + side2 + ", ���������� ����� " + hypot + ".");
	}

}
