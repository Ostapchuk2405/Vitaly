/**
 * 
 */
package part14Generalization;

/**
 * Необобщённый класс может быть суперклассом для обобщённого класса
 * 
 * @author Shiltd
 *
 */

//	Необобщённый класс
class NonGen2 {
	int num;

	NonGen2(int i) {
		num = i;
	}

	int getNum() {
		return num;
	}
}

//	Обобщённый класс
class Gen3<T> extends NonGen2 {

	T ob; // Объявление объекта типа T

//	передать объект конструктору типа T
	Gen3(T o, int i) {
		super(i);
		ob = o;
	}

	T getOb() {
		return ob;
	}

}

class HierDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Gen3<String> w = new Gen3("Добро пожаловать", 47);

		System.out.print(w.getOb() + " ");
		System.out.println(w.getNum());
	}

}
