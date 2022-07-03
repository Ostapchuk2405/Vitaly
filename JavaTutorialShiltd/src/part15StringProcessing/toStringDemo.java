/**
 * 
 */
package part15StringProcessing;

/**
 * ��������������� ������ toString() ��� ������ Box
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
		return "������� " + width + " �� " + height + " �� " + depth + ".";
	}
	
	
}

class toStringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Box b =  new Box(10, 12, 14);
		String s = "Box b: " + b;  // ������������ ������� Box
		System.out.println(b);    // �������������� Box � ������
		System.out.println(s);
	}

}
