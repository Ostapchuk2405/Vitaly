/**
 * 
 */
package part14Generalization;

/**
 * Демонстрация шаблона. Stats находится в BoundsDemo
 * 
 * @author Shiltd
 *
 */
class WildcardDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Integer inums[] = { 1, 2, 3, 4, 5 };
		Stats<Integer> iob = new Stats<Integer>(inums);
		double v = iob.average();
		System.out.println("Среднее для iob равно " + v);

		Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Stats<Double> dob = new Stats<Double>(dnums);
		double w = dob.average();
		System.out.println("Среднее для dob равно " + w);

		Float fnums[] = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F };
		Stats<Float> fob = new Stats<Float>(fnums);
		double x = fob.average();
		System.out.println("Среднее для fob равно " + x);

//		посмотреть какие массивы имеют одинаковые средние
		System.out.print("Средние iob & dob ");
		if (iob.sameAvg(dob)) {
			System.out.println("равны.");
		} else {
			System.out.println("отличаются.");
		}
		System.out.print("Средние iob & fob ");
		if (iob.sameAvg(fob)) {
			System.out.println("равны.");
		} else {
			System.out.println("отличаются.");
		}
	}

}
