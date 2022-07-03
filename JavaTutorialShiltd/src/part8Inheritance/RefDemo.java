/**
 * 
 */
package part8Inheritance;

/**
 * Переменная суперкласса может ссылаться на объект подкласса
 * 
 * @author Shiltd
 *
 */
class RefDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
		Box plainbox = new Box();

		double vol = weightbox.volume();
		System.out.println("Объём weightbox равен " + vol);
		System.out.println("Вес weight равен " + weightbox.weight);
		System.out.println();

//		присваивание ссылке на объект  BoxWeight ссылке на объект Box
		plainbox = weightbox;
		vol = plainbox.volume();
		System.out.println("Объём plainbox равен " + vol);

//		System.out.println("Вес plainbox равен " + plainbox.weight);   Ошибка! Т.к. plainbox не определяет weight

	}

}
