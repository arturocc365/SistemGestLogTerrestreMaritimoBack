package com.arturo.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.arturo.demo.model.entity.District;

public interface IDistrictDAO extends CrudRepository<District, Long> {
	List<District> findByProvinceId(Long province_id);
}
