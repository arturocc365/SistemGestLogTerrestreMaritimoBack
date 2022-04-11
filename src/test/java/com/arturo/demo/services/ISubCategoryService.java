package com.arturo.demo.services;

import java.util.List;

import com.arturo.demo.model.entity.SubCategory;

public interface ISubCategoryService {
	public List<SubCategory> findAll();

	public List<SubCategory> findByCategoryId(Long cat_id);

	public List<SubCategory> findAllDisabledByAccountId(Long account_id);

	public List<SubCategory> findAllEnabledByAccountId(Long account_id);

	public SubCategory findById(Long id);

	public SubCategory save(SubCategory subCategory);

	public void deleteById(Long id);

	public void logicDelete(Long id);

	public void logicDeleteUp(Long id);

	public void deleteByCategoryId(Long category_id);
}
