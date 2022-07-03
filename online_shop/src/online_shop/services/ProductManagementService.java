package online_shop.services;

import java.util.List;

import online_shop.enteties.Product;

public interface ProductManagementService {
	
	List<Product> getProducts();
	
	Product getProductById(int productIdToAddToCart);

}
