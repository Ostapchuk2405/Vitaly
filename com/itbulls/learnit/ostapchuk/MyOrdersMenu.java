package com.itbulls.LearnIT.Ostapchuk.onlinestore;

public class MyOrdersMenu implements Menu {
	
	private Aplication context;
	private OrderManagementService orderManagementService;
	{
		context = Aplication.getInstance();
		orderManagementService = DefaultOrderManagementService.getInstance();
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		printMenu();
		if(context.getLoggedInUser() == null) {
			System.out.println("Log in or create new account");
			new MainMenu().start();
			return;
		} else {
			printUserOrdersToConsole();
		}
		new MainMenu().start();
	}
	private void printUserOrdersToConsole() {
		Order[] loggedInUserOrders = orderManagementService.getOrderByUserId(context.getLoggedInUser().getId());
		
		if(loggedInUserOrders == null || loggedInUserOrders.length == 0) {
			System.out.println("You don't have any orders yet");
		} else {
			for(Order order:loggedInUserOrders) {
				System.out.println(order);
			}
		}
	}

	@Override
	public void printMenu() {
		// TODO Auto-generated method stub
		System.out.println("MY ORDERS");
	}

}
