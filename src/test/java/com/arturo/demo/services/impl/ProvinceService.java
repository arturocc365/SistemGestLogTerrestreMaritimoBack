package com.arturo.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arturo.demo.dao.IProvinceDAO;
import com.arturo.demo.model.entity.Province;
import com.arturo.demo.services.IProvinceService;


@Service
public class ProvinceService implements IProvinceService{

	@Autowired
	private IProvinceDAO provinceDAO;

	@Override
	public List<Province> findAllByDepartmentId(Long department_id) {
		return this.provinceDAO.findByDepartmentId(department_id);
	}

	@Override
	public Province findById(Long id) {
		return this.provinceDAO.findById(id).orElse(null);
	}
	
	
}
