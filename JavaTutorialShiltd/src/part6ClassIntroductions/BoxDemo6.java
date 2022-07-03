/**
 * 
 */
package part6ClassIntroductions;

/**
 * В этом примере класс Box использует конструктор для инициализации размеров параллелипипеда.
 * @author Shiltd
 *
 */
 class BoxDemo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol;
		
		vol = mybox1.volume();
		System.out.println("Объём равен " + vol);

		vol = mybox2.volume();
		System.out.println("Объём равен " + vol);
	}

}
