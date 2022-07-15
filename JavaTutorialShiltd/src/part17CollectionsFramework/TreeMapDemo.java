/**
 * 
 */
package part17CollectionsFramework;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Демонстрация TreeMap
 * 
 * @author Shiltd
 *
 */
class TreeMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		Создать карту-дерево.
		TreeMap<String, Double> tm = new TreeMap<String, Double>();

//		поместить элементы в карту
		tm.put("Джон Доу", new Double(3434.34));
		tm.put("Том Смит", new Double(123.22));
		tm.put("Джейн Бейкер", new Double(1378.00));
		tm.put("Тод Холл", new Double(99.22));
		tm.put("Ральф Смит", new Double(-19.08));

//		получить набор элементов
		Set<Map.Entry<String, Double>> set = tm.entrySet();

//		отобразить набор
		for (Map.Entry<String, Double> me : set) {
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println();
		
//		добавить 1000 на счёт Джон Доу
		double balance = tm.get("Джон Доу");
		tm.put("Джон Доу", balance + 1000);
		System.out.println("Новый баланс Джон Доу: " + tm.get("Джон Доу"));
	}

}
