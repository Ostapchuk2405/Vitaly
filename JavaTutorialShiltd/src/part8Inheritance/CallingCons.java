/**
 * 
 */
package part8Inheritance;

/**
 * Демонстрация порядка вызова конструкторов.
 * @author Shiltd
 *
 */

class E{
	E(){
		System.out.println("Конструктор E");
	}
}

class F extends E{
	F(){
		System.out.println("Конструктор F");
	}
}

class G extends F{
	G(){
		System.out.println("Конструктор G");
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
