package part2ReviewJava;

/**
 * ������������� ���������� ��������� If
 * 
 * @author Shildt
 * 
 *
 */

public class IfSample {
	
	/**
	 * 
	 * @param args x int
	 * 
	 */

	public static void main(String[] args) {

		int x, y;

		x = 10;
		y = 20;

		if (x < y)
			System.out.println("x ������ y");

		x = x * 2;
		if (x == y)
			System.out.println("x ������ ����� y");

		x = x * y;
		if (x > y)
			System.out.println("x ������ ������ y");

//		���� �������� �� ����� ������ ����������
		if (x == y)
			System.out.println("�� �� ������� ���");
	}

}
