/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.Scanner;

/**
 * ������������ ���������� FindInLine
 * 
 * @author Schiltd
 *
 */
class FindInLineDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String instr = "���: ��� �������: 28 ID: 77";
		Scanner conin = new Scanner(instr);

//		����� � ���������� �������
		conin.findInLine("�������:"); // ����� �������
		if (conin.hasNext())
			System.out.println("\n\t" + conin.next());
		else {
			System.out.println("������!");
		}

		conin.close();
	}

}
