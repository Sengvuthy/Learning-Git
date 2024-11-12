package com.piseth.java.school.phoneshopnight.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.piseth.java.school.phoneshopnight.dto.BrandDTO;
import com.piseth.java.school.phoneshopnight.entity.Brand;

@Mapper
public interface BrandMapper {

	BrandMapper INSTANCE = Mappers.getMapper(BrandMapper.class);
	Brand toBrand(BrandDTO dto);
	
	BrandDTO toBrandDTO(Brand entity);
}