package com.arturo.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.arturo.demo.model.entity.Province;

public interface IProvinceDAO extends CrudRepository<Province, Long>{
	List<Province> findByDepartmentId(Long department_id);
}
