/**
 * 
 */
package part4Operatos;

/**
 * ����� ����� �������� ���� byte
 * 
 * @author Shiltd
 *
 */
public class ByteShift {

	/**
	 * @param args ���������� �� � ����� ���������� ������
	 */
	public static void main(String[] args) {

		byte a = 64, b;
		int i;

		i = a << 2;
		b = (byte) (a << 2);

		System.out.println("�������������� �������� �: " + a);
		System.out.println("i and b: " + i + " " + b);
	}

}
