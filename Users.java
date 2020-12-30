package strings.format.mathpi;

import java.util.Arrays;

public class Users {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] user = { "admin", "guest" };
		System.out.println(Arrays.toString(user));
		if (user[0].contains("admin") & user[1].contains("guest"))
			System.out.println("Please, select either ADMIN or " + "GUEST mode");
		 if (user[0].contains("admin"))
			System.out.println("Hello, admin!");
		else
			System.out.println("Hello, guest!");
	}
}
