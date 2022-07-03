/**
 * 
 */
package part12EnumAutoboxAnnotation.annotations;

/**
 * ����������� ���������
 * @author Shiltd
 *
 */

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MySingle {
	int value(); // ������ ���������� ������ ���� value
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
			System.out.println("����� �� ������");
		}
	}

	public static void main(String[] args) {
		myMeth();

	}

}
