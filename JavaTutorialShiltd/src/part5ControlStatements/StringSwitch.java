/**
 * 
 */
package part5ControlStatements;

/**
 * ������������� ������ ��� �������� ���������
 * 
 * @author Shiltd
 *
 */
public class StringSwitch {

	/**
	 * @param args ��������� ���������� �� ������
	 */
	public static void main(String[] args) {

		String str = "���";
		switch (str) {
		case "����":
			System.out.println("����");
			break;
		case "���":
			System.out.println("���");
			break;
		case "���":
			System.out.println("���");
			break;
		default:
			System.out.println("��� ������������");
		}
	}

}
