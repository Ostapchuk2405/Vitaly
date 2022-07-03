package online_shop;

import online_shop.menu.Menu;
import online_shop.menu.impl.MainMenu;

public class Main {

	public static final String EXIT_COMMAND = "exit";

	public static void main(String[] args) {

		Menu mainMenu = new MainMenu();
		mainMenu.start();
	}

}
