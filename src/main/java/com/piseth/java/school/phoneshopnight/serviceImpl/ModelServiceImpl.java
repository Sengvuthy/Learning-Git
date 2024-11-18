package com.piseth.java.school.phoneshopnight.serviceImpl;

import org.springframework.stereotype.Service;

import com.piseth.java.school.phoneshopnight.dto.ModelDTO;
import com.piseth.java.school.phoneshopnight.entity.Model;
import com.piseth.java.school.phoneshopnight.repository.ModelRespository;
import com.piseth.java.school.phoneshopnight.service.ModelService;
import com.piseth.java.school.phoneshopnight.service.util.ModelMapper;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ModelServiceImpl implements ModelService{
	private final ModelRespository modelRespository;
	private final ModelMapper modelMapper;
	
	@Override
	public Model save(ModelDTO dto) {
		Model model = modelMapper.toModel(dto);
		return modelRespository.save(model);
	}

}
