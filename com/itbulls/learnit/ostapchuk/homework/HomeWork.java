
public class Users {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputArguments = String.join(",", args);
		String adminFlag = "--admin";
		String guestFlag = "--guest";
		if (inputArguments.contains(adminFlag) && inputArguments.contains(guestFlag))
			System.out.println("Please,select either ADMIN or" + "GUEST mode");
		else if (inputArguments(adminFlag))
			System.out.println("Hello, admin!");
		else
			System.out.println("Hello, guest");
	}
}
