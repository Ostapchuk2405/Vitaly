/**
 * 
 */
package part6ClassIntroductions;

/**
 * ���������, ������������ ����� Box
 * @author Shiltd
 *
 */

 class BoxDemo {

	/**
	 * @param args ��������� ������ ������ Box � ����������� �������� ����������
	 */
	public static void main(String[] args) {

		Box myBox = new Box();
		double vol;
		
		myBox.width = 10;
		myBox.height = 20;
		myBox.depth = 15;
		
		vol = myBox.width * myBox.height * myBox.depth;
		System.out.println("����� ����� " + vol);
	}

}
