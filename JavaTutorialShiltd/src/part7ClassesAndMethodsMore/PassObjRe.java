/**
 * 
 */
package part7ClassesAndMethodsMore;

/**
 * Объекты передаются по ссылке по них
 * @author Shiltd
 *
 */

class Test3{
	int a,b;
	
	Test3(int i, int j){
		a = i;
		b = j;
	}
	
//	передача объекта
	void meth(Test3 o) {
		o.a *= 2;
		o.b /= 2;
	}
}

 class PassObjRe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Test3 ob = new Test3(15, 20);
		System.out.println("ob.a & ob.b перед вызовом: " + ob.a + " " + ob.b);
		
		ob.meth(ob);
		System.out.println("ob.a & ob.b после вызова: " + ob.a + " " + ob.b);
	}

}
