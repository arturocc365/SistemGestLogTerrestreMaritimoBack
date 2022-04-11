package com.arturo.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arturo.demo.dao.IProductDAO;
import com.arturo.demo.model.entity.Product;
import com.arturo.demo.services.IProductService;



@Service
public class ProductService implements IProductService {
	@Autowired
	private IProductDAO productDAO;

	@Transactional( readOnly = true)
	@Override
	public List<Product> findAll() {
		return (List<Product>) productDAO.findAll();
	}

	@Transactional( readOnly = true)
	@Override
	public Product findById(Long id) {
		return productDAO.findById(id).orElse(null);
	}

	@Transactional
	@Override
	public Product save(Product product) {
		return productDAO.save(product);
	}

	@Transactional
	@Override
	public void logicDelete(Long id) {
		productDAO.setLogicDelete(id);
	}

	@Transactional
	@Override
	public void logicDeleteUp(Long id) {
		productDAO.setLogicDeleteUp(id);
	}

	@Transactional
	@Override
	public List<Product> findByAccountId(Long id) {
		return this.productDAO.findByAccountId(id);
	}

	@Transactional
	@Override
	public void deleteById(Long id) {
		this.productDAO.deleteById(id);		
	}

}
