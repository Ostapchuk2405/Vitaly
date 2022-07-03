package part3TypesVariablesArrays;

/**
 * Демонстрация области видимости блока
 * 
 * @author Shiltd
 * @return Value x and y
 *
 */

public class Scope {

	public static void main(String[] args) {

		int x; // эта переменная известна всему коду внутри метода main

		x = 10;
		if (x == 10) { // начало новой облаобласти видимости, известной только этому блоку
			int y = 20; // и x, и y известны в этой области видимости

			System.out.println("x & y: " + x + " " + y);
		}
//		y = 100; 		Ошибка! y не известна в этой области видимости

//	Переменная x известна и здесь
		System.out.println("x = " + x);

	}
}