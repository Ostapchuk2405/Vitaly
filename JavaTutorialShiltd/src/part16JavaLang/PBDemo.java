/**
 * 
 */
package part16JavaLang;

/**
 * ������������ ������� ����� �������
 * 
 * @author Shiltd
 *
 */
class PBDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			ProcessBuilder proc = new ProcessBuilder("notepad.exe",
					"c:\\Users\\Admin\\Desktop\\JavaProjects\\JavaTutorialShiltd\\resources\\part16\\testfile");
			proc.start();
		} catch (Exception e) {
			System.out.println("������ ������� notepad.");
		}
	}

}
