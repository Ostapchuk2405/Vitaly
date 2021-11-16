package com.itbulls.learnit.javacore.finaltask.menu.impl;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import com.itbulls.learnit.javacore.finaltask.Main;
import com.itbulls.learnit.javacore.finaltask.configs.ApplicationContext;
import com.itbulls.learnit.javacore.finaltask.menu.Menu;

public class MainMenu implements Menu {

	public static final String MENU_COMMAND = "menu";

	private ApplicationContext context;

	{
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		createWindow();
		if(context.getMainMenu() == null) {
			context.setMainMenu(this);
		}
		Menu menuToNavigate = null;
	
		

	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** MAIN MENU *****");

	}

	@Override
	public void createWindow() {

		JFrame frame = new JFrame();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

		JLabel mainMenu = new JLabel("***** MAIN MENU *****");
		mainMenu.setForeground(Color.BLUE);
		mainMenu.setFont(new Font("Arial", Font.PLAIN, 35));
		mainMenu.setHorizontalAlignment(JLabel.CENTER);
		frame.add(mainMenu, BorderLayout.NORTH);

		JRadioButton signUpMenu = new JRadioButton("Sign Up");
		JRadioButton signInMenu = new JRadioButton("Sign In");
		JRadioButton productCatalogMenu = new JRadioButton("Product Catalog");
		JRadioButton myOrdersMenu = new JRadioButton("My Orders");
		JRadioButton settingsMenu = new JRadioButton("Settings");
		JRadioButton customerListMenu = new JRadioButton("Customer List");

		signUpMenu.setBounds(500, 100, 200, 50);
		signInMenu.setBounds(500, 200, 200, 50);
		productCatalogMenu.setBounds(500, 300, 400, 50);
		myOrdersMenu.setBounds(500, 400, 200, 50);
		settingsMenu.setBounds(500, 500, 200, 50);
		customerListMenu.setBounds(500, 600, 400, 50);

		signUpMenu.setBackground(Color.LIGHT_GRAY);
		signInMenu.setBackground(Color.LIGHT_GRAY);
		productCatalogMenu.setBackground(Color.LIGHT_GRAY);
		myOrdersMenu.setBackground(Color.LIGHT_GRAY);
		settingsMenu.setBackground(Color.LIGHT_GRAY);
		customerListMenu.setBackground(Color.LIGHT_GRAY);

		signUpMenu.setFont(new Font("Arial", Font.ITALIC, 30));
		signInMenu.setFont(new Font("Arial", Font.ITALIC, 30));
		productCatalogMenu.setFont(new Font("Arial", Font.ITALIC, 30));
		myOrdersMenu.setFont(new Font("Arial", Font.ITALIC, 30));
		settingsMenu.setFont(new Font("Arial", Font.ITALIC, 30));
		customerListMenu.setFont(new Font("Arial", Font.ITALIC, 30));

		ButtonGroup changesGroup = new ButtonGroup();
		changesGroup.add(signUpMenu);
		changesGroup.add(signInMenu);
		changesGroup.add(productCatalogMenu);
		changesGroup.add(myOrdersMenu);
		changesGroup.add(settingsMenu);
		changesGroup.add(customerListMenu);

		frame.add(signUpMenu);
		frame.add(signInMenu);
		frame.add(productCatalogMenu);
		frame.add(myOrdersMenu);
		frame.add(settingsMenu);
		frame.add(customerListMenu);

		JButton button = new JButton("Accept");
		button.setFont(new Font("Ariel", Font.PLAIN, 20));
		button.setBackground(Color.CYAN);
		button.setBounds(500, 750, 200, 50);
		frame.add(button);

	}

}
