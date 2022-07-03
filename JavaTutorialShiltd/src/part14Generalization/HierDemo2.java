/**
 * 
 */
package part14Generalization;

/**
 * ������������ ����� ����� ���� ������������ ��� ����������� ������
 * 
 * @author Shiltd
 *
 */

//	������������ �����
class NonGen2 {
	int num;

	NonGen2(int i) {
		num = i;
	}

	int getNum() {
		return num;
	}
}

//	���������� �����
class Gen3<T> extends NonGen2 {

	T ob; // ���������� ������� ���� T

//	�������� ������ ������������ ���� T
	Gen3(T o, int i) {
		super(i);
		ob = o;
	}

	T getOb() {
		return ob;
	}

}

class HierDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Gen3<String> w = new Gen3("����� ����������", 47);

		System.out.print(w.getOb() + " ");
		System.out.println(w.getNum());
	}

}
