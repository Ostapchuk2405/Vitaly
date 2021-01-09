package com.itbulls.LearnIT.Ostapchuk.onlinestore;

public interface ProductManagementService {
	
	Product[] getProducts();
	
	Product getProductById(int productIdToAddToCart);

}
