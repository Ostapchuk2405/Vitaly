/**
 * 
 */
package part5ControlStatements;

/**
 * Демонстрация использования оператора return
 * 
 * @author Shiltd
 *
 */
public class Return {

	/**
	 * @param args возрат к вызывающему объекту
	 */
	public static void main(String[] args) {

		boolean t = true;

		System.out.println("До выполнения возрата.");

		if (t)
			return;
		System.out.println("Этот оператор выполняться не будет.");
	}

}
