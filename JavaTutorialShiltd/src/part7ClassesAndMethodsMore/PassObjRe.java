/**
 * 
 */
package part7ClassesAndMethodsMore;

/**
 * ������� ���������� �� ������ �� ���
 * @author Shiltd
 *
 */

class Test3{
	int a,b;
	
	Test3(int i, int j){
		a = i;
		b = j;
	}
	
//	�������� �������
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
		System.out.println("ob.a & ob.b ����� �������: " + ob.a + " " + ob.b);
		
		ob.meth(ob);
		System.out.println("ob.a & ob.b ����� ������: " + ob.a + " " + ob.b);
	}

}
