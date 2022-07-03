package part3TypesVariablesArrays;

/**
 * Вычисляет расстояние, проходимое светом, с применением переменных типа long.
 * 
 * @author Shildt
 * @return Вернёт расстояние, которое свет прошёл за ... количество дней
 *
 */

public class LightDistance {

	public static void main(String[] args) {

		int lightSpeed;
		long days;
		long seconds;
		long distance;

//		Приблизительная скорость света в милях за секунду
		lightSpeed = 186000;

		days = 1000; // Количество дней

		seconds = days * 24 * 60 * 60; // преоюразование в секунды

		distance = lightSpeed * seconds; // вычисление расстояния

		System.out.print("За " + days);
		System.out.print(" дней свет пройдёт около ");
		System.out.println(distance + " миль");
	}

}
