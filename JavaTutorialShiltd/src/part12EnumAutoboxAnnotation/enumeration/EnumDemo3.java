/**
 * 
 */
package part12EnumAutoboxAnnotation.enumeration;

/**
 * 
 * ������������� ������������ enum, ���������� ���������� � ������
 * 
 * @author Shiltd
 *
 */

enum Apples {
	Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

	private int price;

	Apples(int p) {
		price = p;
	}

	int getPrice() {
		return price;
	}
}

class EnumDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Apples ap;

		System.out.println("Winesap ����� " + Apples.Winesap.getPrice() + " ������.\n");

		System.out.println("��� ���� �����: ");
		for (Apples a : Apples.values()) {
			System.out.println(a + " ����� " + a.getPrice() + " ������.");
		}
	}

}
