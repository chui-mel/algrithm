package com.mel.chui.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SlidingWindowMaxTest {

	private SlidingWindowMax solution = new SlidingWindowMax();

	@Test
	void maxSlidingWindow() {
		int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
		int k = 3;
		assertTrue(Arrays.equals(new int[]{3, 3, 5, 5, 6, 7}, solution.maxSlidingWindow(nums, k)));
	}

	@Test
	void maxSlidingWindowFor2() {
		int[] nums = {9, 11};
		int k = 2;
		assertTrue(Arrays.equals(new int[]{11}, solution.maxSlidingWindow(nums, k)));
	}

	@Test
	void maxSlidingWindowForAnother2() {
		int[] nums = {4, -2};
		int k = 2;
		assertTrue(Arrays.equals(new int[]{4}, solution.maxSlidingWindow(nums, k)));
	}

	@Test
	void maxSlidingWindowFor1() {
		int[] nums = {1, -1};
		int k = 1;
		assertTrue(Arrays.equals(new int[]{1, -1}, solution.maxSlidingWindow(nums, k)));
	}

	@Test
	void maxSlidingWindownA() {
		int[] nums = {-7, -8, 7, 5, 7, 1, 6, 0};
		int k = 4;
		assertTrue(Arrays.equals(new int[]{7, 7, 7, 7, 7}, solution.maxSlidingWindow(nums, k)));
	}
}