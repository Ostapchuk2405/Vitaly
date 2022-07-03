/**
 * 
 */
package part7ClassesAndMethodsMore;

/**
 * @author Shiltd
 *
 */
class StackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Stack mystack1 = new Stack();
		Stack mystack2 = new Stack();

//		Проталкивание чисел в стэк
		for (int i = 0; i < 10; i++)
			mystack1.push(i);
		for (int i = 10; i < 20; i++)
			mystack2.push(i);

//		выталкивание этих чисел из стэка
		System.out.println("Стэк в mystack1:");
		for (int i = 0; i < 10; i++)
			System.out.println(mystack1.pop());

		System.out.println("Стэк в mystack2:");
		for (int i = 0; i < 10; i++)
			System.out.println(mystack2.pop());

//		эти операторы недопустимы
//		mystack1.tos = -2;
//		mystack2.stck[3] = 100;
	}

}
