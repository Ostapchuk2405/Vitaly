/**
 * 
 */
package part8Inheritance;

/**
 * ������ ���������� ������ BoxWeight
 * 
 * @author Shiltd
 *
 */




class DemoSuper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
		BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.76);
		BoxWeight mybox3 = new BoxWeight();
		BoxWeight mycube = new BoxWeight(3, 2);
		BoxWeight myclone = new BoxWeight(mybox1);
		double vol;

		vol = mybox1.volume();
		System.out.println("����� mybox1 ����� " + vol);
		System.out.println("��� mybox1 ����� " + mybox1.weight);
		System.out.println();

		vol = mybox2.volume();
		System.out.println("����� mybox2 ����� " + vol);
		System.out.println("��� mybox2 ����� " + mybox2.weight);
		System.out.println();

		vol = mybox3.volume();
		System.out.println("����� mybox3 ����� " + vol);
		System.out.println("��� mybox3 ����� " + mybox3.weight);
		System.out.println();

		vol = myclone.volume();
		System.out.println("����� myclone ����� " + vol);
		System.out.println("��� myclone ����� " + myclone.weight);
		System.out.println();

		vol = mycube.volume();
		System.out.println("����� mycube ����� " + vol);
		System.out.println("��� mycube ����� " + mycube.weight);
		System.out.println();

	}

}
