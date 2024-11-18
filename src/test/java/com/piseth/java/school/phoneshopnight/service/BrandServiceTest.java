package com.piseth.java.school.phoneshopnight.service;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.h2.command.dml.MergeUsing.When;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.web.client.HttpClientErrorException;

import com.piseth.java.school.phoneshopnight.entity.Brand;
import com.piseth.java.school.phoneshopnight.repository.BrandRepository;
import com.piseth.java.school.phoneshopnight.serviceImpl.BrandServiceImpl;

@ExtendWith(MockitoExtension.class)
public class BrandServiceTest {
	
	@Mock
	private BrandRepository brandRepository;
	private BrandService brandService;
	@BeforeEach
	public void setUp() {
		brandService = new BrandServiceImpl(brandRepository);
	}
	
	@Test
	public void testCreate() {
	
		//given
		Brand brand = new Brand();
		brand.setName("Apple");
		//when
		brandService.create(brand);
		//then
		verify(brandRepository, times(1)).save(brand);
	}
	
	/*
	@Test
	public void testCreate() {

		//Given
		Brand brand = new Brand();
		brand.setName("Apple");
		brand.setId(1);
		//When
		when(brandRepository.save(any(Brand.class))).thenReturn(brand);
		Brand brandReturn = brandService.create(new Brand());
		//Then
		assertEquals(1, brandReturn.getId());
		assertEquals("Apple", brandReturn.getName());
		
	}
	*/
	
	@Test
	public void testGetByIdSuccess() {
		//given
		Brand brand = new Brand();
		brand.setName("Apple");
		brand.setId(1);
		//when
		when(brandRepository.findById(1)).thenReturn(Optional.of(brand));
		Brand brandReturn = brandService.getById(1);
		//then
		assertEquals(1, brandReturn.getId());
		assertEquals("Apple", brandReturn.getName());
	}
	
	@Test
	public void testGetByIdThrow() {
		//given
		//when
		when(brandRepository.findById(2)).thenReturn(Optional.empty());
		//then
		assertThatThrownBy(() -> brandService.getById(2))
			.isInstanceOf(HttpClientErrorException.class);
	}
}
