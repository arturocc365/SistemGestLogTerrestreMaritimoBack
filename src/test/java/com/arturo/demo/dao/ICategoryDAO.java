package com.arturo.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.arturo.demo.model.entity.Category;

public interface ICategoryDAO extends CrudRepository<Category, Long>{
	public List<Category> findByAccountId(Long id);
	
	@Transactional
	@Modifying
	@Query("update Category c set c.disabled = true where c.id = ?1 ")
	public void setLogicDelete(Long id);
	
	@Transactional
	@Modifying
	@Query("update Category c set c.disabled = false where c.id = ?1 ") 
	public void setLogicDeleteUp(Long id);
}
