/**
 * 
 */
package part14Generalization;

/**
 * NonGen - �������������� ���������� Gen, �� ����������� ���������.
 * 
 * @author Shiltd
 *
 */

class NonGen {
	Object ob; // ob ������ ��� Object

//	�������� ������������ ������ �� ������ ���� Object
	NonGen(Object o) {
		ob = o;
	}

//	������� ��� Object
	Object getOb() {
		return ob;
	}

//	�������� ��� ob
	void showType() {
		System.out.println("����� ob �������� " + ob.getClass().getName());
	}
}

// ������������ ������������� ������

class NonGenDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		NonGen iOb;

		iOb = new NonGen(88);

		iOb.showType();

//		�� ���� ��� ���������� ����������
		int v = (Integer) iOb.getOb();
		System.out.println("��������: " + v);
		System.out.println();

		NonGen strOb = new NonGen("���� ��� ���������");

		strOb.showType();

//		����� �� -  ���������� ����������
		String str = (String) strOb.getOb();
		System.out.println("��������: " + str);
		System.out.println();

//		��� �������������, �� ������������� �������
		iOb = strOb;
		v = (Integer) iOb.getOb(); // ������ ������� ����������!!!
	}

}
