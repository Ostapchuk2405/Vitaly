/**
 * 
 */
package part7ClassesAndMethodsMore;

/**
 * Отображение всех аргументов командной строки Чтобы скомпилировать в cmd
 * ввести как пример: java CommandLine аргументы через побел
 * 
 * @author Shiltd
 *
 */
 class CommandLine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++)
			System.out.println("args[" + i + "]: " + args[i]);
	}

}
