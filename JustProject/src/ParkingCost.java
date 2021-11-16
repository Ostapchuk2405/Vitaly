import java.util.Scanner;

public class ParkingCost {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("¬веди сколько часов на парковке сто€л: ");
		int hours = sc.nextInt();

		Double totalCost = 0.0;

		if (hours <= 5) {
			totalCost = (double) (hours * 1);
		}

		if (hours > 5 & hours < 24) {
			totalCost = 5 + (hours - 5) * 0.5;
		}

		if (hours >= 24) {
			totalCost = hours / 24 * 15 + hours%24 * 0.5;
		}

		System.out.println(totalCost);
		sc.close();
	}

}
