package com.piseth.java.school.phoneshopnight.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class GeneralUtilsTest {

	@Test
	public void testGetEvenNuber() {
		//Given
		List<Integer> list = List.of(4,5,3,20,6,8);
		//When
		List<Integer> evenNumber = GeneralUtils.getEvenNumber(list);
		//Then
		assertEquals(4, evenNumber.size());
		assertEquals(4, evenNumber.get(0));
	}
	
	@Test
	public void testToIntegerList() {
		//Given
		List<String> names = List.of("Dara", "Cheata", "Thida");
		//When
		List<Integer> list = GeneralUtils.toIntegerList(names);
		//Then
		assertEquals(3, list.size());
		assertEquals(4, list.get(0));
		assertEquals(6, list.get(1));
		assertEquals(5, list.get(2));
	}
}
