package com.itbulls.LearnIT.Ostapchuk.onlinestore;

import java.util.Scanner;

public class ProductCatalogMenu implements Menu {
	
	private static final String CHECKOUT_COMMAND = "checkout";
	private Aplication context;
	private ProductManagementService productManagementService;
	{
		context = Aplication.getInstance();
		productManagementService = DefaultProductManagementService.getInstance();
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		Menu menuToNavigate = null;
		while (true) {
			printMenu();
			printProductsToConsole();
			
			String userInput = readUserInput();
			if(context.getLoggedInUser() == null) {
				menuToNavigate = new MainMenu();
				System.out.println("You are not logged in");
				break;
			}
			if(userInput.equalsIgnoreCase(MainMenu.MENU_COMMAND)) {
				menuToNavigate = new MainMenu();
				break;
			}
			if (userInput.equalsIgnoreCase(CHECKOUT_COMMAND)) {
				Cart sessionCart = context.getSessionCart();
				if(sessionCart == null || sessionCart.isEmpty()) {
					System.out.println("Your cart is empty");
				} else {
					menuToNavigate = new CheckoutMenu();
					break;
				}
			} else {
				Product productToAddToCart = fetchProduct(userInput);
				if (productToAddToCart == null) {
					System.out.println("Enter product ID to add product to cart");
					continue;
				}
				processAddToCart(productToAddToCart);
			}
		}
		menuToNavigate.start();
	}
	private String readUserInput() {
		System.out.println("Product ID to add to cart: ");
		Scanner sc = new Scanner(System.in);
		String userInput = sc.next();
		sc.close();
		return userInput;
		} 
	   

	private void printProductsToConsole() {
		// TODO Auto-generated method stub
		Product[]products = productManagementService.getProducts();
		for(Product product : products) {
			System.out.println(product);
		}
	}
	private Product fetchProduct(String userInput) {
		int productIdToAddToCart = Integer.parseInt(userInput);
		Product productToAddToCart = productManagementService.getProductById(productIdToAddToCart);
		return productToAddToCart;
	}
	private void processAddToCart(Product productToAddToCart) {
		context.getSessionCart().addProduct(productToAddToCart);
		System.out.printf("Product %s has been added to your cart. \"\r\n"
				+ "If you want to add a new product - enter the product id. \"\r\n"
				+ "If you want to proceed with checkout - enter word \"\r\n"
				+ "‘checkout’ to console %n\", productToAddToCart.getProductName());");
	}
	@Override
	public void printMenu() {
		// TODO Auto-generated method stub
		System.out.println("PRODUCT CATALOG");
		System.out.println("Enter product id to add it to the cart or ‘menu’ if you want to navigate back to the main menu");

	}
	 
}
