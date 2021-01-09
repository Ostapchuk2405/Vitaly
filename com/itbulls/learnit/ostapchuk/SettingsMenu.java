package com.itbulls.LearnIT.Ostapchuk.onlinestore;

import java.util.Scanner;

public class SettingsMenu implements Menu {
	public static final String SETTINGS = "1. Change Password" + System.lineSeparator() +
			"2. Change Email";
	private Aplication context;
	{
		context = Aplication.getInstance();
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		Menu menuToNavigate = null;
  Loop: while (true) {
	  printMenu();
	  if (context.getLoggedInUser() == null) {
		  System.out.println("Log in or create a new account");
		  new MainMenu().start();
		  return;
	  }else {
		  System.out.println("SETTINGS");
		  System.out.println("Enter 'menu' to navigate to the main menu: ");
		  
		  Scanner sc = new Scanner(System.in);
		  String userInput = sc.next();
		  if (userInput.equalsIgnoreCase(MainMenu.MENU_COMMAND)) {
			  menuToNavigate = new MainMenu();
			  break Loop;
		  }
		  sc.close();
		  int userOption = Integer.parseInt(userInput);
		  switch (userOption) {
		  case 1:
			  menuToNavigate = new ChangePasswordMenu();
			  break Loop;
		  case 2:
			  menuToNavigate = new ChangeEmailMenu();
			  break Loop;
			  default:
				  System.out.println("Only 1 & 2 is allowed");
				  continue;
		  }
		  }
  }
		menuToNavigate.start();

	}

	@Override
	public void printMenu() {
		// TODO Auto-generated method stub
		System.out.println("SETTINGS");

	}

}
