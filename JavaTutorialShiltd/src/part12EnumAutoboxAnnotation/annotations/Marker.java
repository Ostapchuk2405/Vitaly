/**
 * 
 */
package part12EnumAutoboxAnnotation.annotations;

/**
 * ���������-������
 * 
 * @author Shiltd
 *
 */

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker {
}

class Marker {

	/**
	 * @param args
	 */

	@MyMarker
	public static void myMeth() {
		Marker ob = new Marker();

		try {
			Method m = ob.getClass().getMethod("myMeth");

			if (m.isAnnotationPresent(MyMarker.class)) {
				System.out.println("MyMarker ������������.");
			}
		} catch (NoSuchMethodException e) {
			System.out.println("����� �� ������.");
		}
	}

	public static void main(String[] args) {

		myMeth();
	}

}
