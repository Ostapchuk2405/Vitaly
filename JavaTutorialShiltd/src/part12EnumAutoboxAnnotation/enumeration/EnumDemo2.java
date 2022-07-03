/**
 * 
 */
package part12EnumAutoboxAnnotation.enumeration;

/**
 * »спользование встроенных методов перечислени€
 * 
 * @author Shiltd
 *
 */
class EnumDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Apple ap;
		System.out.println(" онстанты Apple: ");

//		применение values()
		Apple allApples[] = Apple.values();
		for (Apple a : allApples) {
			System.out.println(a);
		}

		System.out.println();

//		применение valueOf()
		ap = Apple.valueOf("Winesap");
		System.out.println("ар содержит " + ap);
	}

}
