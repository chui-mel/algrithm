package com.mel.chui.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialPositionTest {

	@Test
	void numSpecial() {
		int[][] mat = {
				{0, 0, 0, 0, 0},
				{1, 0, 0, 0, 0},
				{0, 1, 0, 0, 0},
				{0, 0, 1, 0, 0},
				{0, 0, 0, 1, 1}
		};

		SpecialPosition specialPosition = new SpecialPosition();
		assertEquals(3, specialPosition.numSpecial(mat));
	}

	@Test
	void numSpecialTest() {
		int [][] mat = {
				{0,0,0,0,0,1,0,0},
				{0,0,0,0,1,0,0,1},
				{0,0,0,0,1,0,0,0},
				{1,0,0,0,1,0,0,0},
				{0,0,1,1,0,0,0,0}
		};

		SpecialPosition specialPosition = new SpecialPosition();
		assertEquals(1, specialPosition.numSpecial(mat));
	}
}