/**
 * 
 */
package part6ClassIntroductions;

/**
 * � ���� ������� ����� Box ���������� ����������� ��� ������������� �������� ���������������.
 * @author Shiltd
 *
 */
 class BoxDemo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol;
		
		vol = mybox1.volume();
		System.out.println("����� ����� " + vol);

		vol = mybox2.volume();
		System.out.println("����� ����� " + vol);
	}

}
