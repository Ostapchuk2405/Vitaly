/**
 * 
 */
package part5ControlStatements;

/**
 * ������������ ���������� ��������� continue
 * 
 * @author Shiltd
 *
 */
public class Continue {

	/**
	 * @param args ����
	 */
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
			if (i % 2 == 0)
				continue;
			System.out.println("");
		}
	}

}
