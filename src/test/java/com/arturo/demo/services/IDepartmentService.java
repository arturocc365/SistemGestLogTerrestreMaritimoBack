package com.arturo.demo.services;

import java.util.List;

import com.arturo.demo.model.entity.Department;


public interface IDepartmentService {
	List<Department> findAllByCountryId(Long country_id);

	Department findById(Long department_id);
}
