/**
 * 
 */
package part12EnumAutoboxAnnotation.enumeration;

/**
 * ������������� ���������� ������� ������������
 * 
 * @author Shiltd
 *
 */
class EnumDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Apple ap;
		System.out.println("��������� Apple: ");

//		���������� values()
		Apple allApples[] = Apple.values();
		for (Apple a : allApples) {
			System.out.println(a);
		}

		System.out.println();

//		���������� valueOf()
		ap = Apple.valueOf("Winesap");
		System.out.println("�� �������� " + ap);
	}

}
