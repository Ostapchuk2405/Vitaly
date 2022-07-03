/**
 * 
 */
package part14Generalization;

/**
 * ����� T ��������� ����� Object �� ���������
 * ����� Gen ��������� � GenDemo
 * @author Shiltd
 *
 */

//	����� T ��������� String
class GenStr<T extends String>{
	T str; // ����� � ����� ������ String
	
	GenStr(T o){
		str = o;
	}
	
	T getStr() {
		return str;
	}
}

class GenTypeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Gen<Integer> iOb = new Gen(99);
		Gen < Float> fOb = new Gen(102.2F);
		
		System.out.println(iOb.getClass().getName());
		System.out.println(fOb.getClass().getName());
	}

}
