/**
 * 
 */
package part9PackagesAndInterfaces;

/**
 * ��� ���� ���������� ���������� Callback
 * @author Shiltd
 *
 */
class AnotherClient implements Callback {

	public void callback(int param) {

		System.out.println("��� ���� ������ Callback");
		System.out.println("param � �������� ����� " + (param*param));
	}

	
}
