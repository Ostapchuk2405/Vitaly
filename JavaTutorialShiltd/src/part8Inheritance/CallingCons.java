/**
 * 
 */
package part8Inheritance;

/**
 * ������������ ������� ������ �������������.
 * @author Shiltd
 *
 */

class E{
	E(){
		System.out.println("����������� E");
	}
}

class F extends E{
	F(){
		System.out.println("����������� F");
	}
}

class G extends F{
	G(){
		System.out.println("����������� G");
	}
}

class CallingCons {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		G g = new G();
	}

}
