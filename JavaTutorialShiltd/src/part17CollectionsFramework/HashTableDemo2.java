/**
 * 
 */
package part17CollectionsFramework;

import java.util.*;

/**
 * Применение итераторов с Hashtable
 * 
 * @author Shiltd
 *
 */
class HashTableDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Hashtable<String, Double> balance = new Hashtable<String, Double>();

		String str;
		double bal;

		balance.put("Джон Доу", 3434.34);
		balance.put("Том Смит", new Double(123.22));
		balance.put("Джейн Бейкер", new Double(1378.00));
		balance.put("Тод Холл", new Double(99.22));
		balance.put("Ральф Смит", new Double(-19.08));

//		отобразить все счета в хеш-таблице
//		для начала получить ключь в виде набора
		Set<String> set = balance.keySet();

//		получить итератор 
		Iterator<String> itr = set.iterator();

		while (itr.hasNext()) {
			str = itr.next();
			System.out.println(str + ": " + balance.get(str));
		}
		System.out.println();

//		добавить 1000 на счёт Джон Доу
		bal = balance.get("Джон Доу");
		balance.put("Джон Доу", bal + 1000);
		System.out.println("Новый баланс Джон Доу: " + balance.get("Джон Доу"));
	}

}
