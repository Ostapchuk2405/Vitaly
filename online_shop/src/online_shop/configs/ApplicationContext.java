package online_shop.configs;

import online_shop.enteties.Cart;
import online_shop.enteties.User;
import online_shop.enteties.impl.DefaultCart;
import online_shop.menu.Menu;

public class ApplicationContext {

	private static ApplicationContext instance;

	private User loggedInUser;
	private Menu mainMenu;
	private Cart sessionCart;

	public ApplicationContext() {
	}

	public User getLoggedInUser() {
		return this.loggedInUser;
	}

	public void setLoggedInUser(User loggedInUser) {
		if (this.loggedInUser != null) {
			this.sessionCart.clear();
		}
		this.loggedInUser = loggedInUser;
	}

	public Menu getMainMenu() {
		return this.mainMenu;
	}

	public void setMainMenu(Menu mainMenu) {
		this.mainMenu = mainMenu;
	}

	public static ApplicationContext getInstance() {
		if (instance == null) {
			instance = new ApplicationContext();
		}
		return instance;
	}

	public Cart getSessionCart() {
		if (this.sessionCart == null) {
			this.sessionCart = new DefaultCart();
		}
		return this.sessionCart;
	}

}
