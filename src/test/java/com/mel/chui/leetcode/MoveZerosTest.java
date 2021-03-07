package com.mel.chui.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MoveZerosTest {

	private MoveZeros solution = new MoveZeros();

	@Test
	void moveZeroes() {
		int[] nums = {0, 1, 0, 3, 12};
		solution.moveZeroes(nums);

		assertTrue(Arrays.equals(nums, new int[]{1, 3, 12, 0, 0}));
	}

	@Test
	void moveZeroesOneElement() {
		int[] nums = {1};
		solution.moveZeroes(nums);

		assertTrue(Arrays.equals(nums, new int[]{1}));
	}
}