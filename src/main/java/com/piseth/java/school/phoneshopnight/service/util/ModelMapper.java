package com.piseth.java.school.phoneshopnight.service.util;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.piseth.java.school.phoneshopnight.dto.ModelDTO;
import com.piseth.java.school.phoneshopnight.entity.Brand;
import com.piseth.java.school.phoneshopnight.entity.Model;
import com.piseth.java.school.phoneshopnight.service.BrandService;

@Mapper(componentModel = "spring", uses = {BrandService.class})
public interface ModelMapper {
	ModelMapper INSTANCE = Mappers.getMapper(ModelMapper.class);
	
	@Mapping(target = "brand", source = "brandId")
	Model toModel(ModelDTO dto);
	
	/*
	default Brand toBrand(Integer brId) {
		Brand brand = new Brand();
		brand.setId(brId);
		return brand;
	}
	*/
}
