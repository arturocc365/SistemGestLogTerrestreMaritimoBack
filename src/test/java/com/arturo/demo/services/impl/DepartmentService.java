package com.arturo.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arturo.demo.dao.IDepartmentDAO;
import com.arturo.demo.model.entity.Department;
import com.arturo.demo.services.IDepartmentService;

@Service
public class DepartmentService implements IDepartmentService{

	@Autowired
	private IDepartmentDAO departmentDAO;

	@Override
	public List<Department> findAllByCountryId(Long country_id) {
		return this.departmentDAO.findByCountryId(country_id);
	}

	@Override
	public Department findById(Long department_id) {
		return this.departmentDAO.findById(department_id).orElse(null);
	}

}
