/**
 * 
 */
package part5ControlStatements;

/**
 * ������������� ��������� break ��� ������ �� ����� while
 * 
 * @author Shiltd
 *
 */
public class BreakLoop2 {

	/**
	 * @param args ����� �������
	 */
	public static void main(String[] args) {

		int i = 0;

		while (i < 100) {
			if (i == 10)
				break;
			System.out.println("i: " + i);
			i++;
		}
		System.out.println("���� ��������.");
	}

}