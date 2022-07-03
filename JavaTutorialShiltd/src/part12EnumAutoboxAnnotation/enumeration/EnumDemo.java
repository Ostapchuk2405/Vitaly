/**
 * 
 */
package part12EnumAutoboxAnnotation.enumeration;

/**
 * ������������ ������ �����
 * 
 * @author Shiltd
 *
 */

enum Apple {
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Apple ap;

		ap = Apple.RedDel;

		System.out.println("�������� ��: " + ap);
		System.out.println();

		ap = Apple.GoldenDel;
		if (ap == Apple.GoldenDel) {
			System.out.println("�� �������� GoldenDel.\n");
		}

		switch (ap) {
		case Jonathan:
			System.out.println("Jonathan �������");
			break;
		case GoldenDel:
			System.out.println("Golden Deliciolus �����");
			break;
		case RedDel:
			System.out.println("Red Deliciolus �������");
			break;
		case Winesap:
			System.out.println("Winesap �������");
			break;
		case Cortland:
			System.out.println("CortLand �������");
		}
	}

}
