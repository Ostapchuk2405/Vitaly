/**
 * 
 */
package part9PackagesAndInterfaces.p1;

/**
 * 
 * @author Shiltd
 *
 */
class Derived extends Protection {

	Derived() {
		System.out.println(" онструктор подкласса");
		System.out.println("n = " + n);

//		доступно только дл€ класса Protection
//		System.out.println("n_pri = " + n_pri);

		System.out.println("n_pro = " + n_pro);
		System.out.println("n_pub = " + n_pub);
	}
}
