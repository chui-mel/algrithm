package com.mel.chui.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RainWaterTrapperTest {

	RainWaterTrapper trapper;

	@BeforeEach
	void setUp() {
		trapper = new RainWaterTrapper();
	}

	@Test
	void trap() {
		int[] input = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		assertEquals(6, trapper.trap(input));
	}

	@Test
	void trap2() {
		int[] input = {4, 2, 0, 3, 2, 5};
		assertEquals(9, trapper.trap(input));
	}
}