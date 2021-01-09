package com.itbulls.LearnIT.Ostapchuk.onlinestore;


public class CustomerListMenu implements Menu {
	
	private Aplication context;
	private UserManagementService userManagementService;
	{
		userManagementService = DefaultUserManagementService.getInstance();
		context = Aplication.getInstance();
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		printMenu();
		User[] users = userManagementService.getUsers();
		
		if (users.length == 0) {
			System.out.println("There are no customers");
		} else {
			for (User user : users) {
				System.out.println(user);
			}
		}
		context.getMainMenu().start();
	}

	@Override
	public void printMenu() {
		// TODO Auto-generated method stub
		System.out.println("USERS");
	}

}
