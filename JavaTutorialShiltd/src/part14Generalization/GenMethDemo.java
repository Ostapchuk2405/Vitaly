/**
 * 
 */
package part14Generalization;

/**
 * Демонстрация простого обобщённого метода.
 * 
 * @author Shiltd
 *
 */
class GenMethDemo {

//	Определение, содержится ли объект в массиве
	static <T, V extends T> boolean isIn(T x, V[] y) {
		for (int i = 0; i < y.length; i++) {
			if (x.equals(y[i]))
				return true;
		}
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		применение isIn для Integer
		Integer nums[] = { 1, 2, 3, 4, 5 };
		if (isIn(2, nums)) {
			System.out.println("2 содержится в nums");
		}
		if (!isIn(7, nums)) {
			System.out.println("7 не содержится в nums");
		}
		System.out.println();

//		применение isIn для String
		String strs[] = { "один", "два", "три", "четыре", "пять" };
		if (isIn("два", strs)) {
			System.out.println("два содержится в strs");
		}
		if (!isIn("семь", strs)) {
			System.out.println("семь не содержится в strs");
		}

//		не скомпилируется! типы должны быть совместимы
//		if (isIn("два", nums)) {
//			System.out.println("два содержится в strs");
//		}
	}

}
