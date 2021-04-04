package com.mel.chui.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestDistanceTest {

	private ShortestDistance solution = new ShortestDistance();

	@Test
	void shortestToChar() {
		String s = "loveleetcode";
		char c = 'e';

		assertArrayEquals(new int[]{3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0},
				solution.shortestToChar(s, c));
	}

	@Test
	void shortestToChar2() {
		String s = "aaab";
		char c = 'b';

		assertArrayEquals(new int[]{3,2,1,0},
				solution.shortestToChar(s, c));
	}
}