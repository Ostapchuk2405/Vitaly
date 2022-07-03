/**
 * 
 */
package part5ControlStatements;

/**
 * ������������� ��������� break � ����� for � ����� for-each
 * 
 * @author Shiltd
 *
 */
public class ForEachBreak {

	/**
	 * @param args �������� ������� � �� �����
	 */
	public static void main(String[] args) {

		int sum = 0;
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int x : nums) {
			System.out.println("�������� �����: " + x);
			sum += x;
			if (x == 5)
				break;
		}
		System.out.println("����� ���� ������ ��������� �����: " + sum);
	}

}
