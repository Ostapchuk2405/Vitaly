package online_shop.menu.impl;

import online_shop.configs.ApplicationContext;
import online_shop.menu.Menu;

public class SignOutMenu implements Menu {
	
	private ApplicationContext context;
	
	{
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		printMenuHeader();
		
		context.setLoggedInUser(null);
		context.getMainMenu().start();
	}

	@Override
	public void printMenuHeader() {
		System.out.println("===== SIGN OUT =====");
		System.out.println("Have a nice day !!!");
	}

}
