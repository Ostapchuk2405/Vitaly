/**
 * 
 */
package part16JavaLang;

/**
 * ������������ exec()
 * 
 * @author Shiltd
 *
 */
class ExecDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Runtime r = Runtime.getRuntime();
		Process p = null;

		try {
			p = r.exec("notepad");
		} catch (Exception e) {
			System.out.println("������ ������� ��������.");
		}

	}

}
