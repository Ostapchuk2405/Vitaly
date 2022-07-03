/**
 * 
 */
package part12EnumAutoboxAnnotation.annotations;

/**
 * �������� ��� ��������� ��� ������ � ������.
 * 
 * @author Shiltd
 *
 */

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno2 {
	String str();

	int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {
	String description();
}

@What(description = "��������� ��������� ������")
@MyAnno2(str = "Meta2", val = 99)

class Meta2 {

	/**
	 * @param args
	 */

	@What(description = "��������� ��������� ������")
	@MyAnno2(str = "Testing", val = 100)

	public static void myMeth() {

		Meta2 ob = new Meta2();

		try {
			Annotation annos[] = ob.getClass().getAnnotations();
			System.out.println("��� ��������� ��� Meta2: ");
			for (Annotation a : annos) {
				System.out.println(a);
			}
			System.out.println();

			Method m = ob.getClass().getMethod("myMeth");
			annos = m.getAnnotations();

			System.out.println("��� ��������� ��� myMeth:");
			for (Annotation a : annos) {
				System.out.println(a);
			}
		} catch (NoSuchMethodException e) {
			System.out.println("����� �� ������.");
		}
	}

	public static void main(String[] args) {

		myMeth();
	}

}
