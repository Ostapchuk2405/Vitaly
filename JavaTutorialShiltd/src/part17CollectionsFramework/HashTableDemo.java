/**
 * 
 */
package part17CollectionsFramework;

import java.util.*;

/**
 * Демонстрация применения Hashtable
 * 
 * @author Shiltd
 *
 */
class HashTableDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Hashtable<String, Double> balance = new Hashtable<String, Double>();

		Enumeration<String> names;

		String str;
		double bal;

		balance.put("Джон Доу", new Double(3434.34));
		balance.put("Том Смит", new Double(123.22));
		balance.put("Джейн Бейкер", new Double(1378.00));
		balance.put("Тод Холл", new Double(99.22));
		balance.put("Ральф Смит", new Double(-19.08));

//		показать все счета в хеш-таблице
		names = balance.keys();
		while (names.hasMoreElements()) {
			str = names.nextElement();
			System.out.println(str + ": " + balance.get(str));
		}
		System.out.println();

//		добавить 1000 на счёт Джон Доу
		bal = balance.get("Джон Доу");
		balance.put("Джон Доу", bal + 1000);
		System.out.println("Новый баланс Джон Доу: " + balance.get("Джон Доу"));
	}

}
