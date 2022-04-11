package com.arturo.demo.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.arturo.demo.model.entity.SubCategory;

public interface ISubCategoryDAO extends CrudRepository<SubCategory, Long>{
	public List<SubCategory> findByCategoryId(Long id);
	
	@Query(value = "SELECT s.* FROM subcategories s " + 
			"INNER JOIN categories c ON (c.id=s.category_id) " + 
			"WHERE s.disabled IS FALSE AND c.account_id= ?1",nativeQuery = true)
	public Collection<SubCategory> findAllEnabledByAccountId(Long account_id);
	
	@Query(value = "SELECT s.* FROM subcategories s " + 
			"INNER JOIN categories c ON (c.id=s.category_id) " + 
			"WHERE s.disabled IS TRUE AND c.account_id= ?1",nativeQuery = true)
	public Collection<SubCategory> findAllDisabledByAccountId(Long account_id);
	
	@Transactional
	@Modifying
	@Query(value="delete from subcategories sc where sc.category_id= ?1", nativeQuery = true)
	public void deleteByCategoryId(Long category_id);

	@Transactional
	@Modifying
	@Query("update SubCategory sc set sc.disabled = true where sc.id = ?1 ")
	public void setLogicDelete(Long id);
	
	@Transactional
	@Modifying
	@Query("update SubCategory sc set sc.disabled = false where sc.id = ?1 ") 
	public void setLogicDeleteUp(Long id);
}
