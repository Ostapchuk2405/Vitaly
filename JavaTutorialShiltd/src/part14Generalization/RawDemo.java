/**
 * 
 */
package part14Generalization;

/**
 * ������������ �������� ����. 
 * ����� Gen ��������� � GenDemo
 * 
 * @author Shiltd
 *
 */
class RawDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		������� ������ Gen ��� Integer
		Gen<Integer> iOb = new Gen<Integer>(88);

//		��� String
		Gen<String> strOb = new Gen<String>("���������� ����.");

//		������� ������ ���� Gen � ���� ��� �������� ���� Double
		Gen raw = new Gen(new Double(98.6));

//		���������� ����������, ��������� ��� ����������
		double d = (Double) raw.getOb();
		System.out.println("��������: " + d);

//		������������� ������� ����� ����� ������� ���������� ������� ����������.
//		���� ������������ ��������� �������

//		��������� ���������� ������������� ������� ����������!
//		int i = (Integer) raw.getOb(); // ������ ������� ����������

//		��� ���������� �������� ������������ �����
		strOb = raw; // ��, �� ������������ �������
//		String str = strOb.getOb(); // ������ ������� ����������

//		��� ���������� ����� �������� ������������ �����
		raw = iOb; // ��, �� ������������ �������
//		d = (Double) raw.getOb(); // ������ ������� ����������
	}

}
