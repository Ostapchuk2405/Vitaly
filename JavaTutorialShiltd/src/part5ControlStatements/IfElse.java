/**
 * 
 */
package part5ControlStatements;

/**
 * ������������ ���������� ���������� if-else-if
 * 
 * @author Shiltd
 *
 */
public class IfElse {

	/**
	 * @param args ���������� ����� ���� ������ �� ��������� ������
	 */
	public static void main(String[] args) {

		int month = 4; // ������
		String season;
		if (month == 12 || month == 1 || month == 2)
			season = "����";
		else if (month == 3 || month == 4 || month == 5) {
			season = "�����";
		} else if (month == 6 || month == 7 || month == 8) {
			season = "����";
		} else if (month == 9 || month == 10 || month == 11) {
			season = "�����";
		} else {
			season = "����������� �����";
		}
		System.out.println("������ ��������� � " + season + ".");
	}

}
