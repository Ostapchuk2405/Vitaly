/**
 * 
 */
package part9PackagesAndInterfaces.interfaces;

/**
 * @author Shiltd
 *
 */
class NestedIFDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		A.NestedIF nif = new B();
		
		if(nif.isNotNegative(10)) System.out.println("10 не является отрицательным");
		if(nif.isNotNegative(-12))
		System.out.println("Это не будет отображаться.");
	}

}
