/**
 * 
 */
package part2ReviewJava;

/**
 * ������������� ���� for ��������������� � ����
 * 
 * @author Shildt
 * @return Value x and y
 *
 */
public class BlockTest {

	/**
	 * @param x ������������� ����������
	 * @param y ������������� ����������
	 * 
	 */
	public static void main(String[] args) {

		int x, y;

		y = 20;

//		������� ������ ����� ����� - ����
		for (x = 0; x < 10; x++) {
			System.out.println("�������� x: " + x);
			System.out.println("�������� y: " + y);
			y = y - 2;
		}
	}

}
