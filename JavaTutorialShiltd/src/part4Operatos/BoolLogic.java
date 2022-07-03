/**
 * 
 */
package part4Operatos;

/**
 * Демонстрация применения булевых логических операторов.
 * @author Shiltd
 *
 */
public class BoolLogic {

	/**
	 * @param args булевые переменные после логических операций над ними.
	 */
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		boolean c = a | b;
		boolean d = a & b;
		boolean e = a ^ b;
		boolean f = (!a & b) | (a & !b);
		boolean g = !a;
		
		System.out.println("                  a = " + a);
		System.out.println("                  b = " + b);
		System.out.println("                a|b = " + c);
		System.out.println("                a&b = " + d);
		System.out.println("                a^b = " + e);
		System.out.println("(!a & b) | (a & !b) = " + f);
		System.out.println("                 !a = " + g);
	}

}
