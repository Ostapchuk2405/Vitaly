/**
 * 
 */
package part12EnumAutoboxAnnotation.annotations;

/**
 * Одночленная аннотация
 * @author Shiltd
 *
 */

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MySingle {
	int value(); // именем переменной должно быть value
}

class Single {

	/**
	 * @param args
	 */

	@MySingle(100)
	public static void myMeth() {
		Single ob = new Single();

		try {
			Method m = ob.getClass().getMethod("myMeth");
			MySingle anno = m.getAnnotation(MySingle.class);
			System.out.println(anno.value());
		} catch (NoSuchMethodException e) {
			System.out.println("Метод не найден");
		}
	}

	public static void main(String[] args) {
		myMeth();

	}

}
