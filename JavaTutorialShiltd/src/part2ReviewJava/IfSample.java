package part2ReviewJava;

/**
 * Демонстрирует применение оператора If
 * 
 * @author Shildt
 * 
 *
 */

public class IfSample {
	
	/**
	 * 
	 * @param args x int
	 * 
	 */

	public static void main(String[] args) {

		int x, y;

		x = 10;
		y = 20;

		if (x < y)
			System.out.println("x меньше y");

		x = x * 2;
		if (x == y)
			System.out.println("x теперь равна y");

		x = x * y;
		if (x > y)
			System.out.println("x теперь больше y");

//		этот оператор не будет ничего отображать
		if (x == y)
			System.out.println("Вы не увидите его");
	}

}
