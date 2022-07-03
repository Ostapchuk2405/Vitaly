package online_shop.services.impl;

import java.util.List;

import online_shop.enteties.Product;
import online_shop.services.ProductManagementService;
import online_shop.storage.ProductStoringService;
import online_shop.storage.impl.DefaultProductStoringService;

public class DefaultProductManagementService implements ProductManagementService {
	
	private static DefaultProductManagementService instance;
	private static List<Product> products;
	private static ProductStoringService productStoringService;
	
	static {
		productStoringService = new DefaultProductStoringService();
		loadProductsFromStorage();
	}
	
	public static void loadProductsFromStorage() {
		products = productStoringService.loadProducts();
	}
	
	private DefaultProductManagementService() {
	}

	public static ProductManagementService getInstance() {
		if(instance == null) {
			instance = new DefaultProductManagementService();
		}
		return instance;
	}



	@Override
	public List<Product> getProducts() {
		return products;
	}



	@Override
	public Product getProductById(int productIdToAddToCart) {
		for(Product product : products) {
			if(product != null && product.getId() == productIdToAddToCart) {
				return product;
			}
		}
		return null;
	}

}
