/**
 * 
 */
package part14Generalization;

/**
 * Простой обобщённый класс. Здесь Т - это параметр типа, который будет заменён
 * реалбным типом при создании объекта класса Gen
 * 
 * @author Shiltd
 *
 */

class Gen<T> {
	T ob; // Объявление объекта типа T

//	Передать конструктору  ссылку на объект типа Т.
	Gen(T o) {
		ob = o;
	}

//	Вернуть ob
	T getOb() {
		return ob;
	}

//	Показать тип Т.
	void showType() {
		System.out.println("Типом Т является " + ob.getClass().getName());
	}
}

class GenDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		Создать Gen-ссылку для Integers.
		Gen<Integer> iOb;

//		Создание объекта Gen<Integer> и присвоить ссылку на iOb.
//		Отметьте применение автоупаковки для инкапсуляции значения 88 в объект Integer.
		iOb = new Gen<Integer>(88);

//		Показать тип данных, используемый iOb.
		iOb.showType();

//		Получить значение iOb.
//		Обратить внимание, что никакого приведения типов не нужно.
		int v = iOb.getOb();
		System.out.println("v = " + v);
		System.out.println();

//		Создать объект Gen для String.
		Gen<String> strOb = new Gen<String>("Обобщённый тест");

		strOb.showType();

		String str = strOb.getOb();
		System.out.println("Значение: " + str);
	}

}
