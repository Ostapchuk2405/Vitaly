package online_shop.menu.impl;

import java.util.Scanner;

import online_shop.configs.ApplicationContext;
import online_shop.enteties.User;
import online_shop.enteties.impl.DefaultUser;
import online_shop.menu.Menu;
import online_shop.services.UserManagementService;
import online_shop.services.impl.DefaultUserManagementService;

public class SignUpMenu implements Menu {
	
	private UserManagementService userManagementService;
	private ApplicationContext context;
	
	{
		userManagementService = DefaultUserManagementService.getInstance();
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		printMenuHeader();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		String firstName = sc.next();
		
		System.out.print("Enter your last name: ");
		String lastName = sc.next();
		
		System.out.print("Enter your password: ");
		String password = sc.next();
		
		System.out.print("Enter your email: ");
		sc = new Scanner(System.in);
		String email = sc.nextLine();
		
//		this is need to load all users for proper ID generation
		userManagementService.getUsers();
		User user = new DefaultUser(firstName, lastName, password, email);
		
		String errorMessage = userManagementService.registerUser(user);
		if(errorMessage == null || errorMessage.isEmpty()) {
			context.setLoggedInUser(user);
			System.out.println("New user is created.");
		}else {
			System.out.println(errorMessage);
		}
		context.getMainMenu().start();
	}

	@Override
	public void printMenuHeader() {
		System.out.println("===== SIGN UP =====");
	}

}
