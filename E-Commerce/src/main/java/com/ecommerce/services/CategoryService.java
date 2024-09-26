package com.ecommerce.services;

import java.util.List;

import com.ecommerce.models.Category;

public interface CategoryService {
	
	List<Category> getAll();
	Boolean create(Category category);
	Category findById(Integer id);
	Boolean update (Category category);
	Boolean delete (Integer id);

}
