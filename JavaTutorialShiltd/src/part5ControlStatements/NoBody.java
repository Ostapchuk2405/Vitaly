/**
 * 
 */
package part5ControlStatements;

/**
 * Целевая часть цикла может быть пустой
 * 
 * @author Shiltd
 *
 */
public class NoBody {

	/**
	 * @param args средний результат i & j
	 */
	public static void main(String[] args) {

		int i, j;
		i = 100;
		j = 200;
		while (++i < --j)
			;
		System.out.println("Среднее значение равно " + i);

	}

}
