/**
 * 
 */
package part17CollectionsFramework;

import java.util.*;

/**
 * Использование списка свойст по умолчанию
 * 
 * @author Shiltd
 *
 */
class PropertiesDemoDefault {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Properties defList = new Properties();
		defList.put("Флорида", "Тэлесси");
		defList.put("Висконсин", "Мэдисон");

		Properties capitals = new Properties(defList);
		capitals.put("Иллинойс", "Спрингфилд");
		capitals.put("Миссури", "Джефферсон-сити");
		capitals.put("Вашингтон", "Олимпия");
		capitals.put("Калифорния", "Сакраменто");
		capitals.put("Индиана", "Индианаполис");

//		получить набор ключей
		Set<?> states = capitals.keySet();

//		показать все штаты и столицы
		for (Object name : states)
			System.out.println("Столица штата " + name + " - " + capitals.getProperty((String) name));
		System.out.println();

//		теперь Флорида будет найдена в списке по умолчанию
		String str = capitals.getProperty("Флорида");
		System.out.println("Столица Флориды - " + str + ".");
	}

}
