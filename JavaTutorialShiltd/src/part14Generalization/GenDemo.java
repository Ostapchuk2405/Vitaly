/**
 * 
 */
package part14Generalization;

/**
 * ������� ���������� �����. ����� � - ��� �������� ����, ������� ����� ������
 * �������� ����� ��� �������� ������� ������ Gen
 * 
 * @author Shiltd
 *
 */

class Gen<T> {
	T ob; // ���������� ������� ���� T

//	�������� ������������  ������ �� ������ ���� �.
	Gen(T o) {
		ob = o;
	}

//	������� ob
	T getOb() {
		return ob;
	}

//	�������� ��� �.
	void showType() {
		System.out.println("����� � �������� " + ob.getClass().getName());
	}
}

class GenDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		������� Gen-������ ��� Integers.
		Gen<Integer> iOb;

//		�������� ������� Gen<Integer> � ��������� ������ �� iOb.
//		�������� ���������� ������������ ��� ������������ �������� 88 � ������ Integer.
		iOb = new Gen<Integer>(88);

//		�������� ��� ������, ������������ iOb.
		iOb.showType();

//		�������� �������� iOb.
//		�������� ��������, ��� �������� ���������� ����� �� �����.
		int v = iOb.getOb();
		System.out.println("v = " + v);
		System.out.println();

//		������� ������ Gen ��� String.
		Gen<String> strOb = new Gen<String>("���������� ����");

		strOb.showType();

		String str = strOb.getOb();
		System.out.println("��������: " + str);
	}

}
