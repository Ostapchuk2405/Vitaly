/**
 * 
 */
package part12EnumAutoboxAnnotation.enumeration;

/**
 * ѕеречисление сортов €блок
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

		System.out.println("«начение ар: " + ap);
		System.out.println();

		ap = Apple.GoldenDel;
		if (ap == Apple.GoldenDel) {
			System.out.println("ар содержит GoldenDel.\n");
		}

		switch (ap) {
		case Jonathan:
			System.out.println("Jonathan красный");
			break;
		case GoldenDel:
			System.out.println("Golden Deliciolus жЄлтый");
			break;
		case RedDel:
			System.out.println("Red Deliciolus красный");
			break;
		case Winesap:
			System.out.println("Winesap красный");
			break;
		case Cortland:
			System.out.println("CortLand красный");
		}
	}

}
