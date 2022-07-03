/**
 * 
 */
package part14Generalization;

/**
 * Аргумент типа Т должен быть либо Number, либо классом, унаследованным от него
 * 
 * @author Shiltd
 *
 */

class Stats<T extends Number> {
	T[] nums; // массив Number или подкласса

	Stats(T[] o) {
		nums = o;
	}

//	Возратить double во всех случаях.
	double average() {
		double sum = 0.0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i].doubleValue();
		}
		return sum / nums.length;
	}

//	Определение эквивалентности двух средних.
//	Внимание на использование шаблонов
	boolean sameAvg(Stats<?> ob) {
		if (average() == ob.average()) {
			return true;
		} else {
			return false;
		}
	}
}

class BoundsDemo {

	/**
	 * @param args Демонстрация Stats
	 */
	public static void main(String[] args) {

		Integer inums[] = { 1, 2, 3, 4, 5 };
		Stats<Integer> iob = new Stats<Integer>(inums);
		double v = iob.average();
		System.out.println("Среднее значение iob равно: " + v);

		Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Stats<Double> dob = new Stats<Double>(dnums);
		double w = dob.average();
		System.out.println("Среднее значение dob равно: " + w);

//		Это не скомпилируется, потому что String не является подклассом Number.
//		String strs[] = { "1", "2", "3", "4", "5" };
//		Stats<String> strob = new Stats<String>(strs);
//		double x = strob.average();
//		System.out.println("Среднее значение strob равна: " +  x);
	}

}
