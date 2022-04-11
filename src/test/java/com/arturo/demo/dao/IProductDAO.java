package com.arturo.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.arturo.demo.model.entity.Product;

public interface IProductDAO extends CrudRepository<Product, Long>{
	public List<Product> findByAccountId(Long id);

	@Transactional
	@Modifying
	@Query("update Product p set p.deleted = true where p.id = ?1 ")
	public void setLogicDelete(Long id);
	
	@Transactional
	@Modifying
	@Query("update Product p set p.deleted = false where p.id = ?1")
	public void setLogicDeleteUp(Long id);
}
