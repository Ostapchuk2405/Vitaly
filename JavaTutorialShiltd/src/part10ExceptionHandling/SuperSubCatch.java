/**
 * 
 */
package part10ExceptionHandling;

/**
 * �������� ������ ���� ����� ��� ������������ � ������������������ ����������
 * catch. � ��������� ������ ����� ������ ������������ ���, ��� ������� �
 * ������ ����������.
 * 
 * @author Shiltd
 *
 */
class SuperSubCatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			int a = 0;
			int b = 42 / a;
		} catch (Exception e) {
			System.out.println("����� �������� Exception.");
//		} catch (ArithmeticException e) {
//			System.out.println("��� ������� �� ����������.");
		}
	}

}
