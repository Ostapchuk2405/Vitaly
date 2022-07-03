/**
 * 
 */
package part8Inheritance;

/**
 * ���������� ����������� ����� ��������� �� ������ ���������
 * 
 * @author Shiltd
 *
 */
class RefDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
		Box plainbox = new Box();

		double vol = weightbox.volume();
		System.out.println("����� weightbox ����� " + vol);
		System.out.println("��� weight ����� " + weightbox.weight);
		System.out.println();

//		������������ ������ �� ������  BoxWeight ������ �� ������ Box
		plainbox = weightbox;
		vol = plainbox.volume();
		System.out.println("����� plainbox ����� " + vol);

//		System.out.println("��� plainbox ����� " + plainbox.weight);   ������! �.�. plainbox �� ���������� weight

	}

}
