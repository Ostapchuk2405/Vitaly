package com.itbulls.LearnIT.Ostapchuk.onlinestore;

public class SignOutMenu implements Menu {
	
	private Aplication context;
	{
		context = Aplication.getInstance();
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		printMenu();
		context.setLoggedInUser(null);
		context.getMainMenu().start();
	}

	@Override
	public void printMenu() {
		// TODO Auto-generated method stub
		System.out.println("Sign Out");
		System.out.println("Good Bye");
	}

}
