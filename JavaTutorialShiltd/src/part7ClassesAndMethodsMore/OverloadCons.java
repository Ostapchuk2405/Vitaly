/**
 * 
 */
package part7ClassesAndMethodsMore;

/**
 * Перегрузка конструктора. Определяет 3 конструктора для инициализации
 * размеров.
 * 
 * @author Shiltd
 *
 */
class Box {

	double width;
	double height;
	double depth;

	Box() {
		width = -1;
		height = -1;
		depth = -1;
	}
	
//	конструктор использует типа Box
	Box(Box ob){
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	Box(double len) {
		width = height = depth = len;
	}

	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	double volume() {
		return width * height * depth;
	}
}

 class OverloadCons {
	public static void main(String[] args) {

//		Создание параллелипипедов с применением различных конструкторов
		Box mybox1 = new Box(10, 20, 15);
		Box mybox2 = new Box();
		Box cube = new Box(7);

		double vol;

		vol = mybox1.volume();
		System.out.println("Объём mybox1 равен " + vol);

		vol = mybox2.volume();
		System.out.println("Объём mybox2 равен " + vol);

		vol = cube.volume();
		System.out.println("Объём cube равен " + vol);
	}
}