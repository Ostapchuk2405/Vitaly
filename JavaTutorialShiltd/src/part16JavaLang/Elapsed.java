/**
 * 
 */
package part16JavaLang;

/**
 * ��������� ������� ���������� ���������.
 * @author Shiltd
 *
 */
class Elapsed {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		long start, end;
		
		System.out.println("����� �������� �� 0 �� 100 000 000");
		
		start = System.currentTimeMillis(); // �������� ��������� ����� 
		for(long i = 0; i<100000000L; i++) ;
		end = System.currentTimeMillis();
		
		System.out.println("����� ����������: " + (end - start));
	}

}
