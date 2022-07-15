/**
 * 
 */
package part17CollectionsFramework;

import java.util.*;

/**
 * Пример использование коллекций до введения обобщений
 * 
 * @author Shiltd
 *
 */
class OldStyle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList list = new ArrayList();
//		lines хранит строки, но могут быть сохранены объекты любого типа.
//		В ходе старого стиля нет возможности защитить тип сохраняемых в коллекции объектов.
		list.add("один");
		list.add("два");
		list.add("три");
		list.add("четыре");
		Iterator itr = list.iterator();

		while (itr.hasNext()) {
//			чтобы извлечь элемент, требуется явное приведение типов,
//			потому что коллекции хранят только Object
			String str = (String) itr.next(); // здесь необходимо приведение типов,
			System.out.println(str + " имеет длинну " + str.length() + " символов.");

		}
	}

}
