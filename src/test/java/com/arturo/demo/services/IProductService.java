package com.arturo.demo.services;

import java.util.List;

import com.arturo.demo.model.entity.Product;


public interface IProductService {
	public List<Product> findAll();

	public List<Product> findByAccountId(Long id);

	public Product findById(Long id);

	public Product save(Product product);

	public void logicDelete(Long id);

	public void logicDeleteUp(Long id);

	public void deleteById(Long id);
}
