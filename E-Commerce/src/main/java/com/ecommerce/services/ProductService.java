package com.ecommerce.services;

import java.util.List;
 
import com.ecommerce.models.Product;

public interface ProductService {
	List<Product> getAll();

	Boolean create(Product product);

	Product findById(Integer id);

	Boolean update(Product product);

	Boolean delete(Integer id);
}
