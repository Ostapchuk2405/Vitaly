/**
 * 
 */
package part7ClassesAndMethodsMore;

/**
 * ����������� ���� ���������� ��������� ������ ����� �������������� � cmd
 * ������ ��� ������: java CommandLine ��������� ����� �����
 * 
 * @author Shiltd
 *
 */
 class CommandLine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++)
			System.out.println("args[" + i + "]: " + args[i]);
	}

}
