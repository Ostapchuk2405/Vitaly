/**
 * 
 */
package part14Generalization;

/**
 * Подкласс может добавлять собственные параметры типа. Класс Gen находится в
 * GenDemo
 * 
 * @author Shiltd
 *
 */

class Gen2<T, V> extends Gen<T> {

	V ob2;

	Gen2(T o, V o2) {
		super(o);
		ob2 = o2;
	}

	V getOb2() {
		return ob2;
	}

}

//	Создание объекта типа Gen2
class HierDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// создание объектов Gen2 для String & Integer
		Gen2<String, Integer> x = new Gen2("Значение равно: ", 99);

		System.out.println(x.getOb());
		System.out.println(x.getOb2());
	}

}
