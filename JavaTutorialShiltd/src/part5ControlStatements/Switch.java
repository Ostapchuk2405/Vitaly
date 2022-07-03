/**
 * 
 */
package part5ControlStatements;

/**
 * ”совершенствованна€ верси€ программы с временами года
 * 
 * @author Shiltd
 *
 */
public class Switch {

	/**
	 * @param args сизон исход€ из заданного мес€ца
	 */
	public static void main(String[] args) {

		int month = 4;
		String season;
		switch (month) {
		case 12:
		case 1:
		case 2:
			season = "зиме";
			break;
		case 3:
		case 4:
		case 5:
			season = "весне";
			break;
		case 6:
		case 7:
		case 8:
			season = "лету";
			break;
		case 9:
		case 10:
		case 11:
			season = "осени";
		default:
			season = "вымышленным мес€цам";
		}
		System.out.println("јпрель относитс€ к " + season);
	}

}
