package com.arturo.demo.services;

import java.util.List;

import com.arturo.demo.model.entity.Category;


public interface ICategoryService {
	List<Category> findAll();

	List<Category> findByAccountId(Long id);

	Category findById(Long id);

	Category save(Category category);

	void deletelogic(Long id);

	void deletelogicup(Long id);

	void deleteById(Long id);
}
