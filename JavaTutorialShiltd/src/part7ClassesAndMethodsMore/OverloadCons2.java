/**
 * 
 */
package part7ClassesAndMethodsMore;

/**
 * В этой версии Box допускается инициализация одного объекта другим
 * 
 * @author Shiltd
 *
 */

 class OverloadCons2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		Создание параллелипипедов с применением различныъ конструкторов
		Box mybox1 = new Box(10, 20, 15);
		Box mybox2 = new Box();
		Box mycube = new Box(7);

		Box myclone = new Box(mybox1);
		double vol;

		vol = mybox1.volume();
		System.out.println("Объём mybox1 равен " + vol);

		vol = mybox2.volume();
		System.out.println("Объём mybox2 равен " + vol);

		vol = mycube.volume();
		System.out.println("Объём mycube равен " + vol);

		vol = myclone.volume();
		System.out.println("Объём myclone равен " + vol);
	}

}
