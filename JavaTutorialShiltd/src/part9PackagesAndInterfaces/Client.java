/**
 * 
 */
package part9PackagesAndInterfaces;

/**
 * ��������� ��������� Callback
 * 
 * @author Shiltd
 *
 */
public class Client implements Callback {

	public void callback(int param) {
		System.out.println("����� callback, ��������� �� ��������� " + param);
	}

	void nonIfaceMeth() {
		System.out.println("������, ������� ��������� ���������� ����� ���������� ����� � ������� ������.");
	}
}
