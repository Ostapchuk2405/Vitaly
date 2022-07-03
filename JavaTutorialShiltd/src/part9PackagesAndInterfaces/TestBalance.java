/**
 * 
 */
package part9PackagesAndInterfaces;

import part9PackagesAndInterfaces.MyPack.Balance;

/**
 * Поскольку класс Balance объявлен как public, то его можно использовать и
 * вызывать конструктор
 * 
 * @author Shiltd
 *
 */
class TestBalance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Balance test = new Balance("J. J. Jaspers", 99.88);
		test.show();
	}

}
