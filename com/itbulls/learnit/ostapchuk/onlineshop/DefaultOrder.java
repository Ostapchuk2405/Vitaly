package com.itbulls.LearnIT.Ostapchuk.onlinestore;

import java.util.Arrays;

public class DefaultOrder implements Order {

	private static final int AMOUNT_OF_DIGITS_IN_CREDIT_CARD_NUMBER = 16;
	private String creditCardNumber;
	private Product[] products;
	private int customerId;

	@Override
	public boolean isCreditCardNumberValid(String userInput) {
		// TODO Auto-generated method stub
		return creditCardNumber.toCharArray().length == AMOUNT_OF_DIGITS_IN_CREDIT_CARD_NUMBER
				&& !creditCardNumber.contains(" ") && Long.parseLong(creditCardNumber) > 0;
	}

	@Override
	public void setCreditCardNumber(String creditCardNumber) {
		// TODO Auto-generated method stub
		if(creditCardNumber == null) {
			return;
		}
		this.creditCardNumber = creditCardNumber;
	}

	@Override
	public void setProducts(Product[] products) {
		// TODO Auto-generated method stub
		this.products = products;
	}

	@Override
	public void setCustomerId(int customerId) {
		// TODO Auto-generated method stub
		this.customerId = customerId;
	}

	@Override
	public int getCustomerId() {
		// TODO Auto-generated method stub
		return this.customerId;
	}
	@Override
	public String toString() {
		return "Order: customer id - " + this.customerId + "\t" +
				"credit card number - " + this.creditCardNumber + "\t" + 
				"products - " + Arrays.toString(this.products);
	}

}
