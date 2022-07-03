/**
 * 
 */
package part12EnumAutoboxAnnotation.enumeration;

/**
 * 
 * »спользование конструктора enum, переменной экземпл€ра и метода
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

		System.out.println("Winesap стоит " + Apples.Winesap.getPrice() + " центов.\n");

		System.out.println("¬се цены €блок: ");
		for (Apples a : Apples.values()) {
			System.out.println(a + " стоит " + a.getPrice() + " центов.");
		}
	}

}
