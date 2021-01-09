package com.itbulls.LearnIT.Ostapchuk.onlinestore;

public interface Cart {
	
	boolean isEmpty();
	
	void addProduct(Product productById);
	
	Product[] getProducts();
	
	void clear();
}
