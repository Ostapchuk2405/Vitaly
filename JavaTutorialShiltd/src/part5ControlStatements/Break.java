/**
 * 
 */
package part5ControlStatements;

/**
 * ������������� ��������� break � �������� �������������� ����� ��������� goto.
 * 
 * @author Shiltd
 *
 */
public class Break {

	/**
	 * @param args ���������, ������� ����� ����������
	 */
	public static void main(String[] args) {

		boolean t = true;

		first: {
			second: {
				third: {
					System.out.println("������������ ��������� break.");
					if (t)
						break second; // ����� �� ����� second
					System.out.println("���� �������� �� ����� �����������");
				}
				System.out.println("���� �������� �� ����� ����������");
			}
			System.out.println("���� �������� ������� �� ������ second.");
		}
	}

}
