package part3TypesVariablesArrays;

/**
 * Демонстрация привидения типов
 * 
 * @author Shiltd
 * 
 * @return Преобразование из одного типа в другой
 * 
 * @implNote Если значение большего типа будет преувеличивать максимальное
 *           значение меньшего типа, то значение будет уменьшено до результата
 *           деления по модулю
 *
 */

public class Conversion {

	public static void main(String[] args) {

		byte b;
		int i = 257;
		double d = 323.142;

		System.out.println("Преобразование int в byte.");
		b = (byte) i;
		System.out.println("i & b " + i + " " + b);

		System.out.println("\nПреобразование double в int.");
		i = (int) d;
		System.out.println("d & i " + d + " " + i);

		System.out.println("\nПреобразование double в byte.");
		b = (byte) d;
		System.out.println("d & b " + d + " " + b);

	}

}
