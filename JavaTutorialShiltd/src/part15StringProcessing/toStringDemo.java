/**
 * 
 */
package part15StringProcessing;

/**
 * Переопределение метода toString() для класса Box
 * @author Shiltd
 *
 */

class Box{
	double width;
	double height;
	double depth;
	
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	@Override
	public String toString() {
		return "Размеры " + width + " на " + height + " на " + depth + ".";
	}
	
	
}

class toStringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Box b =  new Box(10, 12, 14);
		String s = "Box b: " + b;  // конкатенация объекта Box
		System.out.println(b);    // преобразование Box в строку
		System.out.println(s);
	}

}
