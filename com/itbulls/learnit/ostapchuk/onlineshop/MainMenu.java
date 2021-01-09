package com.itbulls.LearnIT.Ostapchuk.onlinestore;

import java.util.Scanner;

public class MainMenu implements Menu {

	public static final String MENU_COMMAND = "menu";

	public static final String FOR_LOGGED_OUT = "1. Sign up\n" + "2. Sign In\n" + "3. Product Catalog \n"
			+ "4. My Orders\n" + "5. Settings \n" + "6. Customer List";

	public static final String FOR_LOGGED_IN = "1. You are registered already \n" + "2. Sign Out \n"
			+ "3. Product Catalog \n" + "4. My Orders \n" + "5. Settings \n" + "6. Customer List";

	private Aplication context;
	{
		context = Aplication.getInstance();
	}

	@Override
	public void start() {
		if (context.getMainMenu() == null) {
			context.setMainMenu(this);
		}

		Menu menuToNavigate = null;
		Loop: while (true) {
			printMenu();

			Scanner sc = new Scanner(System.in);
			String userInput = sc.next();
			if (userInput.equalsIgnoreCase(Main.EXIT_COMMAND)) {
				System.exit(0);
				sc.close();
			} else {
				int commandNumber = Integer.parseInt(userInput);
				switch (commandNumber) {
				case 1:
					menuToNavigate = new SignUpMenu();
					break Loop;
				case 2:
					if (context.getLoggedInUser() == null) {
						menuToNavigate = new SignInMenu();
					} else {
						menuToNavigate = new SignOutMenu();
					}
					break Loop;
				case 3:
					menuToNavigate = new ProductCatalogMenu();
					break Loop;
				case 4:
					menuToNavigate = new MyOrdersMenu();
					break Loop;
				case 5:
					menuToNavigate = new SettingsMenu();
					break Loop;
				case 6:
					menuToNavigate = new CustomerListMenu();
					break Loop;
				default:
					System.out.println("Only 1 - 5 is allowed");
					continue;
				}
			}
		}
		menuToNavigate.start();
	}

	@Override
	public void printMenu() {
		System.out.println("MAIN MENU");
		if (context.getLoggedInUser() == null) {
			System.out.println(FOR_LOGGED_OUT);
		} else {
			System.out.println(FOR_LOGGED_IN);
		}
	}

}
