/**
 * 
 */
package part8Inheritance;

/**
 * � ���� ��������� ������������ ���������� ��� ���������� ������ box
 * 
 * @author Shiltd
 *
 */

class Box {

	double width;
	double height;
	double depth;

	Box(Box ob) {
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	Box() {
		width = -1;
		height = -1;
		depth = -1;
	}

	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	Box(double len) {
		width = height = depth = len;
	}

	double volume() {
		return width * height * depth;
	}
}

class BoxWeight extends Box {
	double weight; // ��� ���������������

	BoxWeight(BoxWeight ob) {
		super(ob);
		weight = ob.weight;
	}

	BoxWeight(double w, double h, double d, double m) {
		super(w, h, d);
		weight = m;
	}

	BoxWeight() {
		super();
		weight = -1;
	}

	BoxWeight(double len, double m) {
		super(len);
		weight = m;
	}
}

class DemoBoxWeight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
		BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
		double vol;

		vol = mybox1.volume();
		System.out.println("����� mybox1 ����� " + vol);
		System.out.println("��� mybox1 ����� " + mybox1.weight);
		System.out.println();

		vol = mybox2.volume();
		System.out.println("����� mybox2 ����� " + vol);
		System.out.println("��� mybox2 ����� " + mybox2.weight);

	}

}
