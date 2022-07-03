package part3TypesVariablesArrays;

/**
 * ѕример демонстрации динамической инициализации
 * 
 * @author Shildt
 * @return √ипотенуза
 *
 */

public class DinamicInit {

	public static void main(String[] args) {

		double a = 3.0, b = 4.0;

//		динамическа€ инициализаци€ переменной c
		double c = Math.sqrt(a * a + b * b);
		System.out.println("√ипотенуза равна " + c);
	}

}
