/**
 * 
 */
package part17CollectionsFramework;

import java.util.*;

/**
 * Демонстрация применения HashSet. В LinkedHashSet элементы будут в том же порядке, в котором их положили в коллекцию
 * 
 * @author Shiltd
 *
 */
class HashSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		создать хэш-набор
		HashSet<String> hs = new HashSet<String>();

//		добавить элементы в хэш-набор
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("E");
		hs.add("C");
		hs.add("F");

		System.out.println(hs);
	}

}
