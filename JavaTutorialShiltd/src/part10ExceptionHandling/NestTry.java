/**
 * 
 */
package part10ExceptionHandling;

/**
 * ѕример вложенных операторов try
 * 
 * @author Shiltd
 *
 */
class NestTry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			int a = args.length;
//		≈сли не указаны параметры командной строки, следующий оператор создаст исключение делени€ на ноль.
			int b = 42 / a;
			System.out.println("a = " + a);

			try {
//			≈сли используетс€ один аргумент командной строки, то тсключение делени€ на ноль 
				// будет созданио следующим кодом
				if (a == 1)
					a = a / (a - a);
//			≈сли 2 аргумента, то исключение выхода за пределы границы.
				if (a == 2) {
					int c[] = { 1 };
					c[42] = 99;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("»ндекс за пределами массива: " + e);
			}
		} catch (ArithmeticException e) {
			System.out.println("ƒеление на 0: " + e);
		}
	}

}
