package com.itbulls.LearnIT.Ostapchuk.onlinestore;

import java.util.Scanner;

public class CheckoutMenu implements Menu {
	
	private Aplication context;
	private OrderManagementService orderManagementService;
	{
		context = Aplication.getInstance();
		orderManagementService = DefaultOrderManagementService.getInstance();
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		while(true) {
			printMenu();
			Scanner sc = new Scanner(System.in);
			String userInput = sc.next();
			sc.close();
			if(!createOrder(userInput)) {
				continue;
			}
			context.getSessionCart().clear();
			break;
		}
		System.out.println("Thanks a lot for your purchace");
		new MainMenu().start();
}
	private boolean createOrder(String creditcardNumber) {
		Order order = new DefaultOrder();
		if(!order.isCreditCardNumberValid(creditcardNumber)) {
			return false;
		}
		order.setCreditCardNumber(creditcardNumber);
		order.setProducts(context.getSessionCart().getProducts());
		order.setCustomerId(context.getLoggedInUser().getId());
		orderManagementService.addOrder(order);
		return true;
	}

	@Override
	public void printMenu() {
		// TODO Auto-generated method stub
		System.out.println("CHECKOUT");
		System.out.println("Enter your credit card whithout space");

	}

}
