/**
 * 
 */
package part12EnumAutoboxAnnotation.annotations;

/**
 * Показать все аннотации для класса и метода.
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

@What(description = "Аннотация тестового класса")
@MyAnno2(str = "Meta2", val = 99)

class Meta2 {

	/**
	 * @param args
	 */

	@What(description = "Аннотация тестового метода")
	@MyAnno2(str = "Testing", val = 100)

	public static void myMeth() {

		Meta2 ob = new Meta2();

		try {
			Annotation annos[] = ob.getClass().getAnnotations();
			System.out.println("Все аннотации для Meta2: ");
			for (Annotation a : annos) {
				System.out.println(a);
			}
			System.out.println();

			Method m = ob.getClass().getMethod("myMeth");
			annos = m.getAnnotations();

			System.out.println("Все аннотации для myMeth:");
			for (Annotation a : annos) {
				System.out.println(a);
			}
		} catch (NoSuchMethodException e) {
			System.out.println("Метод не найден.");
		}
	}

	public static void main(String[] args) {

		myMeth();
	}

}
