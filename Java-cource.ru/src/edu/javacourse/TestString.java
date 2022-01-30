package edu.javacourse;

public class TestString {

	public static void main(String[] args) {

		String s = "1";
		long time1 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			s += "" + i;
		}
		long time2 = System.currentTimeMillis();
		System.out.println(time2 - time1);

		StringBuilder s1 = new StringBuilder("1");
		long time11 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			s1.append("" + i);
		}
		long time21 = System.currentTimeMillis();
		System.out.println(time21 - time11);
	}
}