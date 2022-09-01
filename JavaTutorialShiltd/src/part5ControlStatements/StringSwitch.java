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

		String str = "one";
		switch (str) {
		case "one":
			System.out.println("one");
			break;
		case "two":
			System.out.println("two");
			break;
		case "three":
			System.out.println("three");
			break;
		default:
			System.out.println("There is no this number");
		}
	}

}
