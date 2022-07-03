package part3TypesVariablesArrays;

public class BoolTest {

	public static void main(String[] args) {

		boolean b = false;
		System.out.println("b is " + b);
		b = true;
		System.out.println("b is " + b);

//		Значение типа булин может управлять оператором if
		if (b)
			System.out.println("Это выполняется.");
		b = false;
		if (b)
			System.out.println("Это не выполняется");

//		Результат сравнения - значение типа булин
		System.out.println("10 > 9 is " + (10 > 9));
	}

}
