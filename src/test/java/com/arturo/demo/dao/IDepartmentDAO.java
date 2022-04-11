package com.arturo.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.arturo.demo.model.entity.Department;

public interface IDepartmentDAO extends CrudRepository<Department, Long>{
	List<Department> findByCountryId(Long country_id);
}
