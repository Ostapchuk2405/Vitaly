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
		System.out.println("����������� ����� �� ������");
		System.out.println("n = " + p.n);
		
//		������ ��� ������ ������, �.�. private
//		System.out.println("n_pri = " + p.n_pri);
		
		System.out.println("n_pro = " + p.n_pro);
		System.out.println("n_pub = " + p.n_pub);
	}
}
