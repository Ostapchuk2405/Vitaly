package com.itbulls.LearnIT.Ostapchuk.onlinestore;

import java.util.Scanner;

public class SignInMenu implements Menu {

	private Aplication context;
	private UserManagementService userManagementService;
	{
		context = Aplication.getInstance();
		userManagementService = DefaultUserManagementService.getInstance();
	}
	@Override
	public void start() {
		// TODO Auto-generated method stub
		printMenu();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your email");
		String userEmail = sc.next();
		System.out.println("Enter your password");
		String userPassword = sc.next();
		
		User user = userManagementService.getUserByEmail(userEmail);
		if(user != null && user.getPassword().equals(userPassword)) {
			System.out.println("Wellcome ");
			context.setLoggedInUser(user);
		} else {
			System.out.println("Login or password doesn't exist");
		}
		sc.close();
		context.getMainMenu().start();
	}

	@Override
	public void printMenu() {
		// TODO Auto-generated method stub
		System.out.println("SIGN IN");
	}

}
