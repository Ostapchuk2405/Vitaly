/**
 * 
 */
package part17CollectionsFramework;

import java.util.*;

/**
 * Простой пример работы со списком почтовых адрессов
 * 
 * @author Shiltd
 *
 */

class Address {
	private String name;
	private String street;
	private String city;
	private String state;
	private String code;

	Address(String n, String s, String c, String st, String cd) {
		name = n;
		street = s;
		city = c;
		state = st;
		code = cd;
	}

	@Override
	public String toString() {
		return name + "\n" + street + "\n" + city + "\n" + state + "\n" + code;
	}

}

class MailList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LinkedList<Address> ml = new LinkedList<Address>();

//		добавить элементы в связной список
		ml.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
		ml.add(new Address("ralph Backer", "1142 Maple Lane", "Mehomed", "IL", "61853"));
		ml.add(new Address("Tom Carlton", "867 Elm St", "Champaign", "IL", "61820"));

//		отобразить список всех почтовых адресов
		for (Address element : ml)
			System.out.println(element + "\n");
		System.out.println();
	}

}
