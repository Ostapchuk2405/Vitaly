package online_shop.menu.impl;

import java.util.Scanner;

import online_shop.configs.ApplicationContext;
import online_shop.enteties.User;
import online_shop.menu.Menu;
import online_shop.services.UserManagementService;
import online_shop.services.impl.DefaultUserManagementService;

public class SignInMenu implements Menu {
	
	private ApplicationContext context;
	private UserManagementService userManagementService;
	
	{
		context = ApplicationContext.getInstance();
		userManagementService = DefaultUserManagementService.getInstance();
	}

	@Override
	public void start() {
		printMenuHeader();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your email: ");
		String userEmail = sc.next();
		
		System.out.print("Enter your password: ");
		String userPassword = sc.next();
		
		User user = userManagementService.getUserByEmail(userEmail);
		if(user != null && user.getPassword().equals(userPassword)) {
			System.out.printf("Glad to see you %s %s", user.getFirstName(), user.getLastName() + System.lineSeparator());
			context.setLoggedInUser(user);
		}else {
			System.out.println("Such login or password doesn't exist");
		}
		context.getMainMenu().start();
	}

	@Override
	public void printMenuHeader() {
		System.out.println("===== SIGN IN =====");
	}

}
