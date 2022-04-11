package com.arturo.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arturo.demo.dao.ICategoryDAO;
import com.arturo.demo.model.entity.Category;
import com.arturo.demo.services.ICategoryService;

@Service
public class CategoryService implements ICategoryService{
	@Autowired
	private ICategoryDAO categoryDAO;
	
	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> findByAccountId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category save(Category category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletelogic(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletelogicup(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

}
