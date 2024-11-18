package com.piseth.java.school.phoneshopnight.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.piseth.java.school.phoneshopnight.dto.ModelDTO;
import com.piseth.java.school.phoneshopnight.entity.Model;
import com.piseth.java.school.phoneshopnight.service.ModelService;
import com.piseth.java.school.phoneshopnight.service.util.ModelMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/models")
public class ModelController {
	private final ModelService modelService;
	
	@PostMapping
	public ResponseEntity<?> create(@RequestBody ModelDTO modelDTO){
		Model model = modelService.save(modelDTO);
		return ResponseEntity.ok(model);
	}
}
