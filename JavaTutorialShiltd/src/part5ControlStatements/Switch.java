/**
 * 
 */
package part5ControlStatements;

/**
 * ������������������� ������ ��������� � ��������� ����
 * 
 * @author Shiltd
 *
 */
public class Switch {

	/**
	 * @param args ����� ������ �� ��������� ������
	 */
	public static void main(String[] args) {

		int month = 4;
		String season;
		switch (month) {
		case 12:
		case 1:
		case 2:
			season = "����";
			break;
		case 3:
		case 4:
		case 5:
			season = "�����";
			break;
		case 6:
		case 7:
		case 8:
			season = "����";
			break;
		case 9:
		case 10:
		case 11:
			season = "�����";
		default:
			season = "����������� �������";
		}
		System.out.println("������ ��������� � " + season);
	}

}
