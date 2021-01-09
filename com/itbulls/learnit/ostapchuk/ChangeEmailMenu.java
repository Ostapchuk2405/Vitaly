package com.itbulls.LearnIT.Ostapchuk.onlinestore;

import java.util.Scanner;

public class ChangeEmailMenu implements Menu {

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
		context.getLoggedInUser().setEmail(userInput);
		System.out.println("Email is changed");
		new MainMenu().start();
		sc.close();
	}

	@Override
	public void printMenu() {
		// TODO Auto-generated method stub
		System.out.println("CHANGE EMAIL");
		System.out.println("Enter new email: ");
	}

}
