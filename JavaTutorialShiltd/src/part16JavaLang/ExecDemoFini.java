/**
 * 
 */
package part16JavaLang;

/**
 * ������� ���������� notepad
 * @author Shiltd
 *
 */
class ExecDemoFini {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Runtime r = Runtime.getRuntime();
		Process p = null;

		try {
			p = r.exec("notepad");
			p.waitFor();
		} catch (Exception e) {
			System.out.println("������ ������� ��������.");
		}
		System.out.println("������� ��������� " + p.exitValue());
	}

}
