/**
 * 
 */
package part14Generalization;

/**
 * Демонстрация базового типа. 
 * Класс Gen находится в GenDemo
 * 
 * @author Shiltd
 *
 */
class RawDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		создать объект Gen для Integer
		Gen<Integer> iOb = new Gen<Integer>(88);

//		для String
		Gen<String> strOb = new Gen<String>("Обобщённый тест.");

//		создать объект типа Gen и дать ему значение типа Double
		Gen raw = new Gen(new Double(98.6));

//		привидение необходимо, поскольку тип неизвестен
		double d = (Double) raw.getOb();
		System.out.println("Значение: " + d);

//		использование базовых типов может вызвать исключения времени выполнения.
//		ниже представлены некоторые примеры

//		следующее приведение вызоветошибку времени выполнения!
//		int i = (Integer) raw.getOb(); // ошибка времени выполнения

//		это присвоение нарушает безопасность типов
		strOb = raw; // ок, но потенциально неверно
//		String str = strOb.getOb(); // ошибка времени выполнения

//		это присвоение также нарушает безопасность типов
		raw = iOb; // ок, но потенциально неверно
//		d = (Double) raw.getOb(); // ошибка времени выполнения
	}

}
