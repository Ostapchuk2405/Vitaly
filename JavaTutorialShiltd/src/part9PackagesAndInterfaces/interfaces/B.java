/**
 * 
 */
package part9PackagesAndInterfaces.interfaces;

/**
 * @author Shiltd
 *
 */
class B implements A.NestedIF {

	public boolean isNotNegative(int x) {
		return x < 0 ? false : true;
	}

}
