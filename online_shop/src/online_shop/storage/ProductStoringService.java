package online_shop.storage;

import java.util.List;

import online_shop.enteties.Product;

public interface ProductStoringService {
	
	List<Product> loadProducts();

}
