/**
 * 
 */
package part13InOutAppletOther.applets;

/**
 * ������ ������������� �������-���������� ������ �.�. � ������ ������
 * ����������������
 * 
 * @author Shiltd
 *
 */
public class NativeDemo {

	/**
	 * @param args
	 */

	int i;

	public static void main(String[] args) {

		NativeDemo ob = new NativeDemo();

		ob.i = 10;
		System.out.println("��� ob.i ����� ������� �������-���������� ������: " + ob.i);

		ob.test(); // ����� native ������
		System.out.println("��� ob.i ����� ������� �������-���������� ������: " + ob.i);

	}
// ���������� �������-���������� ������
	public native void test();

	static {
		System.loadLibrary("NativeDemo");
	}
}
