/**
 * 
 */
package part4Operatos;

/**
 * —двиг влево значени€ типа byte
 * 
 * @author Shiltd
 *
 */
public class ByteShift {

	/**
	 * @param args переменные до и после побитового сдвига
	 */
	public static void main(String[] args) {

		byte a = 64, b;
		int i;

		i = a << 2;
		b = (byte) (a << 2);

		System.out.println("ѕервоначальное значение а: " + a);
		System.out.println("i and b: " + i + " " + b);
	}

}
