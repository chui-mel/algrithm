package com.mel.chui.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneSolutionTest {

	@Test
	void plusOne() {
		PlusOneSolution  solution = new PlusOneSolution();
		int[] digits = {9,9,9};
		int[] results = solution.plusOne(digits);

		int[] expectedResult = {1,0,0,0};
		assertArrayEquals(expectedResult, results);
	}
}