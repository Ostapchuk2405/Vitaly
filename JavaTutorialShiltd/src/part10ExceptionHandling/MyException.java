/**
 * 
 */
package part10ExceptionHandling;

/**
 * 
 * ��� ��������� ������ ���������������� ��� ����������
 * 
 * @author Shiltd
 *
 */
class MyException extends Exception {

	private int detail;

	public MyException(int a) {
		detail = a;
	}

	@Override
	public String toString() {
		return "MyException [detail=" + detail + "]";
	}

}
