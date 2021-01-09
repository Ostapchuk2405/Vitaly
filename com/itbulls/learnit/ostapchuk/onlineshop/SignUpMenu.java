package com.itbulls.LearnIT.Ostapchuk.onlinestore;

import java.util.Scanner;

public class SignUpMenu implements Menu {
	
	private UserManagementService userManagementService;
	private Aplication context;
	{
		userManagementService = DefaultUserManagementService.getInstance();
		context = Aplication.getInstance();
	}
	@Override
	public void start() {
		// TODO Auto-generated method stub
		printMenu();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name");
		String firstName = sc.next();
		System.out.println("Enter your last name");
		String lastName = sc.next();
		System.out.println("Enter your password");
		String password = sc.next();
		System.out.println("Enter your email");
		String email = sc.nextLine();
		sc.close();
		
		User user = new DefaultUser(firstName, lastName, password, email);
		
		String errorMessage = userManagementService.registerUser(user);
		if(errorMessage == null || errorMessage.isEmpty()) {
			context.setLoggedInUser(user);
			System.out.println("New user is created");
		} else {
			System.out.println(errorMessage);
		}
		context.getMainMenu().start();
	}

	@Override
	public void printMenu() {
		// TODO Auto-generated method stub
		System.out.println("SIGN UP");
	}

}
