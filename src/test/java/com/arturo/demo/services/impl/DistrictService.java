package com.arturo.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arturo.demo.dao.IDistrictDAO;
import com.arturo.demo.model.entity.District;
import com.arturo.demo.services.IDistrictService;

@Service
public class DistrictService implements IDistrictService {
	@Autowired
	private IDistrictDAO districtDAO;
	
	@Override
	public List<District> findAllByProvinceId(Long province_id) {
		return this.districtDAO.findByProvinceId(province_id);
	}

	@Override
	public District findById(Long id) {
		return this.districtDAO.findById(id).orElse(null);
	}
}
