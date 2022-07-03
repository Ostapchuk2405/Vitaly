/**
 * 
 */
package part16JavaLang;

/**
 * Демонстрация применения totalMemory(), freeMemory() & gc()
 * 
 * @author Shiltd
 *
 */
class MemoryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Runtime r = Runtime.getRuntime();
		long mem1, mem2;
		Integer someInts[] = new Integer[1000];

		System.out.println("Всего памяти: " + r.totalMemory());
		mem1 = r.freeMemory();

		System.out.println("Свободная память вначале: " + mem1);
		r.gc();
		mem1 = r.freeMemory();
		System.out.println("Свободная память после сбора мусора: " + mem1);

		for (int i = 0; i < 1000; i++)
			someInts[i] = new Integer(i);
		mem2 = r.freeMemory();
		System.out.println("Свободная память после распределения: " + mem2);
		System.out.println("Использовано памяти для распределения: " + (mem1 - mem2));

//		отбросить Integers
		for (int i = 0; i < 1000; i++)
			someInts[i] = null;

		r.gc(); // запуск сборщика мусора
		mem2 = r.freeMemory();
		System.out.println("Свободная память после сбора отброшенных Integers: " + mem2);
	}

}
