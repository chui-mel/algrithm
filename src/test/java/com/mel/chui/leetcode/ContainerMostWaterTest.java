package com.mel.chui.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerMostWaterTest {

	private ContainerMostWater solution = new ContainerMostWater();

	@Test
	public void mostWater() {
		int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

		assertEquals(49, solution.maxArea(height));
	}

	@Test
	public void mostWaterTwo() {
		int[] height = {1, 1};

		assertEquals(1, solution.maxArea(height));
	}

	@Test
	public void mostWaterThree() {
		int[] height = {1, 2, 1};

		assertEquals(2, solution.maxArea(height));
	}

	@Test
	public void mostWaterMore() {
		int[] height = {4, 3, 2, 1, 4};

		assertEquals(16, solution.maxArea(height));
	}
}