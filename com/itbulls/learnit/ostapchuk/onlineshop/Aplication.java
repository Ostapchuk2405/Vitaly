package com.itbulls.LearnIT.Ostapchuk.onlinestore;

public class Aplication {

	private static Aplication instance;
	
	private User loggedInUser;
	private Menu mainMenu;
	private Cart sessionCart;
	
	
	private Aplication() {
	}


	public Menu getMainMenu() {
		// TODO Auto-generated method stub
		return this.mainMenu;
	}

	public void setMainMenu(Menu menu) {
		// TODO Auto-generated method stub
		this.mainMenu = menu;
	}


	public void setLoggedInUser(User user) {
		// TODO Auto-generated method stub
		if(this.sessionCart != null) {
			this.sessionCart.clear();
		}
		this.loggedInUser = user;
	}


	public User getLoggedInUser() {
		// TODO Auto-generated method stub
		return this.loggedInUser;
	}
	public static Aplication getInstance() {
		if(instance == null) {
			instance = new Aplication(); }
		return instance;
		}
	public Cart getSessionCart() {
		if(this.sessionCart == null) {
			this.sessionCart = new DefaultCart();
		}
		return this.sessionCart;
	}
	}
	
