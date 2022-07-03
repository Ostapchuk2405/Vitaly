/**
 * 
 */
package part12EnumAutoboxAnnotation.annotations;

/**
 * ќбъ€вление типа аннотаций с включением значений по умолчанию.
 * 
 * @author Shiltd
 *
 */

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno3 {
	String str() default "Testing";

	int val() default 9000;
}

class Meta3 {

	/**
	 * @param args
	 */

	@MyAnno3
	public static void myMeth() {
		Meta3 ob = new Meta3();
		try {
			Class<?> c = ob.getClass();
			Method m = c.getMethod("myMeth");
			MyAnno3 anno = m.getAnnotation(MyAnno3.class);
			System.out.println(anno.str() + " " + anno.val());
		} catch (NoSuchMethodException e) {
			System.out.println("ћетод не найден");
		}
	}

	public static void main(String[] args) {
		myMeth();
	}

}
