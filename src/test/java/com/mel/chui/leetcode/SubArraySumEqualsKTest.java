package com.mel.chui.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubArraySumEqualsKTest {
	private SubArraySumEqualsK s;

	@BeforeEach
	void setUp() {
		s = new SubArraySumEqualsK();
	}

	@Test
	void subarraySum() {
		int[] input = {1, 1, 1};
		assertEquals(2, s.subarraySum(input, 2));
	}

	@Test
	void subarraySum1() {
		int[] input = {1};
		assertEquals(0, s.subarraySum(input, 0));
	}

	@Test
	void subarraySum2() {
		int[] input = {-1, -1, 1};
		assertEquals(1, s.subarraySum(input, 0));
	}

	@Test
	void subarraySum3() {
		int[] input = {1, 2, 3};
		assertEquals(2, s.subarraySum(input, 3));
	}

	@Test
	void subarraySum100() {
		int[] input = {-92, -63, 75, -86, -58, 22, 31, -16, -66, -67, 420};
		assertEquals(1, s.subarraySum(input, 100));
	}
}