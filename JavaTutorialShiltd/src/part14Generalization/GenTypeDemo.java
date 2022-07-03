/**
 * 
 */
package part14Generalization;

/**
 * Здесь T ограничен типом Object по умолчанию
 * Класс Gen находится в GenDemo
 * @author Shiltd
 *
 */

//	Здесь T ограничен String
class GenStr<T extends String>{
	T str; // Здесь Т будет заменён String
	
	GenStr(T o){
		str = o;
	}
	
	T getStr() {
		return str;
	}
}

class GenTypeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Gen<Integer> iOb = new Gen(99);
		Gen < Float> fOb = new Gen(102.2F);
		
		System.out.println(iOb.getClass().getName());
		System.out.println(fOb.getClass().getName());
	}

}
