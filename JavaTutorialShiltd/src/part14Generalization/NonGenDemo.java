/**
 * 
 */
package part14Generalization;

/**
 * NonGen - функциональный эквивалент Gen, не использущий обобщений.
 * 
 * @author Shiltd
 *
 */

class NonGen {
	Object ob; // ob теперь тип Object

//	передать конструктору ссылку на объект типа Object
	NonGen(Object o) {
		ob = o;
	}

//	Вернуть тип Object
	Object getOb() {
		return ob;
	}

//	Показать тип ob
	void showType() {
		System.out.println("Типом ob является " + ob.getClass().getName());
	}
}

// Демонстрация необобщённого класса

class NonGenDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		NonGen iOb;

		iOb = new NonGen(88);

		iOb.showType();

//		На этот раз приведение необходимо
		int v = (Integer) iOb.getOb();
		System.out.println("Значение: " + v);
		System.out.println();

		NonGen strOb = new NonGen("Тест без обобщений");

		strOb.showType();

//		Опять же -  привидение необходимо
		String str = (String) strOb.getOb();
		System.out.println("Значение: " + str);
		System.out.println();

//		Это компилируется, но концептуально неверно
		iOb = strOb;
		v = (Integer) iOb.getOb(); // Ошибка времени выполнения!!!
	}

}
