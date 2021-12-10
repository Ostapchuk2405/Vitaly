package certification;

//class A {
//	public A() {
//		str = "New";
//	}
//
//	public String str;
//}

public class Test {

	public void print(Object o) {
		System.out.println("O");
	}

	public void print(String s) {
		System.out.println("S");
	}

	public void print(Integer i) {
		System.out.println("I");
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.print(null);
	}
}