/**
 * 
 */
package part6ClassIntroductions;

/**
 * Этот класс определяет целочисленный стэк размером 10 значений
 * @author Shiltd
 *
 */
class Stack {

	

		int stck[] = new int[10];
		int tos;
		
		Stack() {
			tos = -1;
		}
		
		void push(int item) {
			if(tos == 9) {
				System.out.println("Стэк полон.");
			}else {
				stck[++tos] = item;
			}
		}
	
		int pop() {
			if(tos < 0) {
				System.out.println("Стэк не загружен.");
				return 0;
			}else {
				return stck[tos--];
			}
		}

}
