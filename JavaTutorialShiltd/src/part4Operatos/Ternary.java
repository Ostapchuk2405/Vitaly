/**
 * 
 */
package part4Operatos;

/**
 * ������������ ������������� ��������� ?.
 * 
 * @author Shiltd
 *
 */
public class Ternary {

	/**
	 * @param args ���������� �������� i
	 */
	public static void main(String[] args) {

		int i, k;

		i = 10;
		k = i < 0 ? -i : i;
		System.out.println("���������� �������� " + i + " = " + k);

		i = -10;
		k = i < 0 ? -i : i;
		System.out.println("���������� �������� " + i + " = " + k);
	}

}
