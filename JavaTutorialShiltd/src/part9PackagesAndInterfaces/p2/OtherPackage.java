/**
 * 
 */
package part9PackagesAndInterfaces.p2;

/**
 * @author Shiltd
 *
 */
 class OtherPackage {

	OtherPackage() {
		part9PackagesAndInterfaces.p1.Protection p = new part9PackagesAndInterfaces.p1.Protection();
		System.out.println("Конструктор другого класса");
		
//		System.out.println("n = " + p.n);
//		System.out.println("n_pri = " + p.n_pri);
//		System.out.println("n_pro = " + p.n_pro);
		System.out.println("n_pub = " + p.n_pub);
	}
}
