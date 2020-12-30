package strings.format.mathpi;

import java.util.Arrays;
import java.util.Scanner;

public class Users2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] users = new String[] { "admin", "guest" };
		System.out.println(Arrays.toString(users));
		if (users[0].contains("admin") && users[1].contains("guest")) {
			System.out.println("Choose your user:");
			System.out.println("To choose admin click 0 and guest click 1");
		}
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		switch (choose) {
		case (0):
			System.out.println("Hello, Admin!");
			break;
		case (1):
			System.out.println("Hello, Guest!");
			break;
		default:
			System.out.println("Please, make your choice");
			
		}	
	
		sc.close();
	}

}
