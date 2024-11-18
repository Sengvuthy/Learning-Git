package com.piseth.java.school.phoneshopnight.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piseth.java.school.phoneshopnight.entity.Brand;
import com.piseth.java.school.phoneshopnight.repository.BrandRepository;
import com.piseth.java.school.phoneshopnight.service.BrandService;
@Service
public class BrandServiceImpl implements BrandService{

	@Autowired
	private BrandRepository brandRepository;
	
	@Override
	public Brand create(Brand brand) {
		return brandRepository.save(brand);
	}

}
