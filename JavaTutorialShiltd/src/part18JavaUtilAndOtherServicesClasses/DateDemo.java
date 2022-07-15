/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.Date;

/**
 * Показывает только время и дату, используя только методы класса Date
 * 
 * @author Schiltd
 *
 */
class DateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		создать объект Date
		Date date = new Date();

//		отобразить дату и время с помощью toString()
		System.out.println(date);

//		отобразить количество миллисекунд, прошедших с 1 января 1970г. по GMT
		long msec = date.getTime();
		System.out.println("\nМиллисекунд, прошедших с 1 января 1970г. по GMT = " + msec);
	}

}
