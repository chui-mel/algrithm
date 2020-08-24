package com.mel.chui.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MostWaterContainerTest {

	MostWaterContainer container;

	@BeforeEach
	void setUp() {
		container = new MostWaterContainer();
	}

	@Test
	void maxArea() {
		int[] input = {1,8,6,2,5,4,8,3,7};
		assertEquals(49, container.maxArea(input));
	}
}