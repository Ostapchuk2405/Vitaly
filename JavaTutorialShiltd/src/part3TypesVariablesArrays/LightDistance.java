package part3TypesVariablesArrays;

/**
 * ��������� ����������, ���������� ������, � ����������� ���������� ���� long.
 * 
 * @author Shildt
 * @return ����� ����������, ������� ���� ������ �� ... ���������� ����
 *
 */

public class LightDistance {

	public static void main(String[] args) {

		int lightSpeed;
		long days;
		long seconds;
		long distance;

//		��������������� �������� ����� � ����� �� �������
		lightSpeed = 186000;

		days = 1000; // ���������� ����

		seconds = days * 24 * 60 * 60; // �������������� � �������

		distance = lightSpeed * seconds; // ���������� ����������

		System.out.print("�� " + days);
		System.out.print(" ���� ���� ������ ����� ");
		System.out.println(distance + " ����");
	}

}
