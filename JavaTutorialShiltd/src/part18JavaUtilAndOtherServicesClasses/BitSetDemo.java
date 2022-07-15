/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.BitSet;

/**
 * Демонстрация применения BitSet
 * 
 * @author Schiltd
 *
 */
class BitSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BitSet bits1 = new BitSet(16);
		BitSet bits2 = new BitSet(16);

//		усановить некоторые биты
		for (int i = 0; i < 16; i++) {
			if ((i % 2) == 0)
				bits1.set(i);
			if ((i % 5) != 0)
				bits2.set(i);
		}

		System.out.println("Начальный шаблон в bits1: ");
		System.out.println(bits1);
		System.out.println("\nНачальный шаблон в bits2: ");
		System.out.println(bits2);

//		Логическое или над битами
		bits2.or(bits1);
		System.out.println("\nbits2 OR bits1: ");
		System.out.println(bits2);

//		длгическое исключение ИЛИ над битами
		bits2.xor(bits1);
		System.out.println("\nbits2 XOR bits1: ");
		System.out.println(bits2);
	}

}
