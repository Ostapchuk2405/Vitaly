/**
 * 
 */
package part17CollectionsFramework;

import java.util.*;

/**
 * Штаты и столицы с использовагнием Properties
 * 
 * @author Shiltd
 *
 */
class PropertiesDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Properties capitals = new Properties();
		capitals.put("Иллинойс", "Спрингфилд");
		capitals.put("Миссури", "Джефферсон-сити");
		capitals.put("Вашингтон", "Олимпия");
		capitals.put("Калифорния", "Сакраменто");
		capitals.put("Индиана", "Индианаполис");

//		получить набор ключей
		Set<?> states = capitals.keySet();

//		показать все штаты и столицы
		for (Object name : states)
			System.out.println("Столица штата " + name + " - " + capitals.getProperty((String) name) + ".");
		System.out.println();

//		поиск штата не содержащегося в списке - с указанием умолчания.
		String str = capitals.getProperty("Флорида", "не найдена");
		System.out.println("Столица Флориды " + str + ".");
	}

}
