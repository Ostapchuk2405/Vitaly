package com.itbulls.LearnIT.Ostapchuk.onlinestore;

import java.util.Arrays;

public class DefaultCart implements Cart {
	
	private static final int DEFAULT_PRODUCT_CAPACITY = 10;
	private Product[] products;
	private int lastIndex;
	{
		products = new Product[DEFAULT_PRODUCT_CAPACITY];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(products == null || products.length == 0) {
			return true;
		}
		for(Product product : products) {
			if(product != null) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		if (product == null) {
			return;
		}
		if (products.length <= lastIndex) {
			products = Arrays.copyOf(products, products.length << 1);
		}
		products[lastIndex++] = product;
	}

	@Override
	public Product[] getProducts() {
		// TODO Auto-generated method stub
		int nonNullProductsAmount = 0;
		for (Product product : products) {
			if(product != null) {
				nonNullProductsAmount++;
			}
		}
		Product[] nonNullProducts = new Product[nonNullProductsAmount];
		int index = 0;
		for(Product product : products) {
			 	if(product != null) {
			 		nonNullProducts[index++] = product;
			 	}
		}
		return nonNullProducts;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		products = new Product[DEFAULT_PRODUCT_CAPACITY];
	}

}
