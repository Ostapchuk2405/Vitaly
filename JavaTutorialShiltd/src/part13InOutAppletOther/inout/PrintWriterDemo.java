/**
 * 
 */
package part13InOutAppletOther.inout;

import java.io.*;

/**
 * ������������ PrintWriter
 * 
 * @author Shiltd
 *
 */
class PrintWriterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PrintWriter pw = new PrintWriter(System.out, true);

		pw.println("��� ������");
		int i = -7;
		pw.println(i);
		double d = 4.5e-7;
		pw.println(d);
	}

}
