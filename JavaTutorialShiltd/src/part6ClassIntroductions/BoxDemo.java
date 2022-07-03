/**
 * 
 */
package part6ClassIntroductions;

/**
 * Программа, использующая класс Box
 * @author Shiltd
 *
 */

 class BoxDemo {

	/**
	 * @param args Объявляет объект класса Box и присваивает значения переменных
	 */
	public static void main(String[] args) {

		Box myBox = new Box();
		double vol;
		
		myBox.width = 10;
		myBox.height = 20;
		myBox.depth = 15;
		
		vol = myBox.width * myBox.height * myBox.depth;
		System.out.println("Объём равен " + vol);
	}

}
