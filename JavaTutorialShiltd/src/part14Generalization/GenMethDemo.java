/**
 * 
 */
package part14Generalization;

/**
 * ������������ �������� ����������� ������.
 * 
 * @author Shiltd
 *
 */
class GenMethDemo {

//	�����������, ���������� �� ������ � �������
	static <T, V extends T> boolean isIn(T x, V[] y) {
		for (int i = 0; i < y.length; i++) {
			if (x.equals(y[i]))
				return true;
		}
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		���������� isIn ��� Integer
		Integer nums[] = { 1, 2, 3, 4, 5 };
		if (isIn(2, nums)) {
			System.out.println("2 ���������� � nums");
		}
		if (!isIn(7, nums)) {
			System.out.println("7 �� ���������� � nums");
		}
		System.out.println();

//		���������� isIn ��� String
		String strs[] = { "����", "���", "���", "������", "����" };
		if (isIn("���", strs)) {
			System.out.println("��� ���������� � strs");
		}
		if (!isIn("����", strs)) {
			System.out.println("���� �� ���������� � strs");
		}

//		�� ��������������! ���� ������ ���� ����������
//		if (isIn("���", nums)) {
//			System.out.println("��� ���������� � strs");
//		}
	}

}
