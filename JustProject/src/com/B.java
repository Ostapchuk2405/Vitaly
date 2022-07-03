package com;

abstract class A {
	void xxx() {
		System.out.println(1);

	}

	void yyy() {
		System.out.println(2);
	}
}

class B extends A {

	void yyy() {
		System.out.println(3);
		;
	}

	void zzz() {
		System.out.println(4);
		;
	}

	public static void main(String[] args) {

		B a = new B();

		a.xxx();
		a.yyy();
		a.zzz();

	}
}

