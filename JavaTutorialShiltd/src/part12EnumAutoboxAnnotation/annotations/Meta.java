/**
 * 
 */
package part12EnumAutoboxAnnotation.annotations;

/**
 * ќбъ€вление типа аннотации
 * @author Shiltd
 *
 */

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
	String str();

	int val();
}

class Meta {

	/**
	 * @param args
	 */

	@MyAnno(str = "ѕример аннотации", val = 100)
	public static void myMeth() {
		Meta ob = new Meta();

		try {
//			дл€ начала получить объект Method, представл€ющий этот метод
			Class<?> c = ob.getClass();
			Method m = c.getMethod("myMeth");
			MyAnno anno = m.getAnnotation(MyAnno.class);
			System.out.println(anno.str() + " " + anno.val());
		} catch (NoSuchMethodException e) {
			System.out.println("ћетод не найден");
		}
	}

	public static void main(String[] args) {

		myMeth();
	}

}
