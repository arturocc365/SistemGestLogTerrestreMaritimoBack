package com.arturo.demo.services;

import java.util.List;

import com.arturo.demo.model.entity.Province;


public interface IProvinceService {
	List<Province> findAllByDepartmentId(Long department_id);

	Province findById(Long id);
}
