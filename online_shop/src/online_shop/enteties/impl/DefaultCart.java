package online_shop.enteties.impl;

import java.util.ArrayList;
import java.util.List;

import online_shop.enteties.Cart;
import online_shop.enteties.Product;

public class DefaultCart implements Cart {

	private List<Product> products;

	{
		products = new ArrayList<>();
	}

	@Override
	public boolean isEmpty() {
		return products.isEmpty();
	}

	@Override
	public void addProduct(Product productById) {
		if (productById == null) {
			return;
		}
		products.add(productById);
	}

	@Override
	public List<Product> getProducts() {
		return this.products;
	}

	@Override
	public void clear() {
		products.clear();
	}

}
