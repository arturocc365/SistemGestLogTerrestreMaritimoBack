package com.arturo.demo.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arturo.demo.dao.ISubCategoryDAO;
import com.arturo.demo.model.entity.SubCategory;
import com.arturo.demo.services.ISubCategoryService;


@Service
public class SubCategoryService implements ISubCategoryService{

	@Autowired
	private ISubCategoryDAO subCategoryDAO;

	@Transactional(readOnly = true)
	@Override
	public List<SubCategory> findAll() {
		return (List<SubCategory>) subCategoryDAO.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public List<SubCategory> findByCategoryId(Long cat_id) {
		return subCategoryDAO.findByCategoryId(cat_id);
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<SubCategory> findAllDisabledByAccountId(Long account_id) {
		return new ArrayList<SubCategory>(this.subCategoryDAO.findAllDisabledByAccountId(account_id));
	}

	@Transactional(readOnly = true)
	@Override
	public List<SubCategory> findAllEnabledByAccountId(Long account_id) {
		return new ArrayList<SubCategory>(this.subCategoryDAO.findAllEnabledByAccountId(account_id));
	}
	
	@Transactional(readOnly = true)
	@Override
	public SubCategory findById(Long id) {
		return subCategoryDAO.findById(id).orElse(null);
	}
	
	@Transactional
	@Override
	public SubCategory save(SubCategory subCategory) {
		return subCategoryDAO.save(subCategory);
	}
	
	@Override
	public void deleteById(Long id) {
		subCategoryDAO.deleteById(id);
	}

	@Transactional
	@Override
	public void logicDelete(Long id) {
		subCategoryDAO.setLogicDelete(id);
	}

	@Transactional
	@Override
	public void logicDeleteUp(Long id) {
		subCategoryDAO.setLogicDeleteUp(id);
	}

	@Override
	public void deleteByCategoryId(Long category_id) {
		this.subCategoryDAO.deleteByCategoryId(category_id);
	}
	
}
