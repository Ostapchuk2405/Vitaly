/**
 * 
 */
package part9PackagesAndInterfaces.p1;

/**
 * @author Shiltd
 *
 */
 class SamePackage {

	SamePackage(){
		Protection p = new Protection();
		System.out.println("Конструктор этого же пакета");
		System.out.println("n = " + p.n);
		
//		только для своего класса, т.к. private
//		System.out.println("n_pri = " + p.n_pri);
		
		System.out.println("n_pro = " + p.n_pro);
		System.out.println("n_pub = " + p.n_pub);
	}
}
