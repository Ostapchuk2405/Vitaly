package com.itbulls.LearnIT.Ostapchuk.onlinestore;

import java.util.Scanner;

public class ChangePasswordMenu implements Menu {
	 
	private Aplication context;
	{
		context = Aplication.getInstance();
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		printMenu();
		Scanner sc = new Scanner(System.in);
		String userInput = sc.next();
		context.getLoggedInUser().setPassword(userInput);
		System.out.println("Your password has been succesfully changed");
		new MainMenu().start();
		sc.close();

	}

	@Override
	public void printMenu() {
		// TODO Auto-generated method stub
		System.out.println("CHANGE PASSWORD");
		System.out.println("Enter new password");

	}

}
