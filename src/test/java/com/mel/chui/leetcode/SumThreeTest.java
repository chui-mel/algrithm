package com.mel.chui.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumThreeTest {

	private SumThree solution = new SumThree();

	@Test
	public void sumThree() {
		int[] nums = {-1, 0, 1, 2, -1, -4};

		List<List<Integer>> results = solution.sumThree(nums);

		assertEquals(2, results.size());
	}

	@Test
	public void sumThreeEmpty() {
		int[] nums = {};

		List<List<Integer>> results = solution.sumThree(nums);

		assertEquals(0, results.size());
	}

	@Test
	public void sumThreeWithOneElement() {
		int[] nums = {0};

		List<List<Integer>> results = solution.sumThree(nums);

		assertEquals(0, results.size());
	}

	@Test
	public void sumThreeAllZeros() {
		int[] nums = {0, 0, 0, 0};
		List<List<Integer>> results = solution.sumThree(nums);

		assertEquals(1, results.size());
	}
}