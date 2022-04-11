package com.arturo.demo.services;

import java.util.List;

import com.arturo.demo.model.entity.District;


public interface IDistrictService {
	List<District> findAllByProvinceId(Long province_id);

	District findById(Long id);
}
