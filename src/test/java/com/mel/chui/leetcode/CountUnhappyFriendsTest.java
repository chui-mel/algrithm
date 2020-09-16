package com.mel.chui.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountUnhappyFriendsTest {

	/**
	 * Input: n = 4, preferences = [[1, 2, 3], [3, 2, 0], [3, 1, 0], [1, 2, 0]], pairs = [[0, 1], [2, 3]]
	 * Output: 2
	 */
	@Test
	void unhappyFriends() {
		CountUnhappyFriends counter = new CountUnhappyFriends();

		int n = 4;
		int [][] preferences = {
				{1, 2, 3},
				{3, 2, 0},
				{3, 1, 0},
				{1, 2, 0}
		};

		int [][] pair = {
				{0, 1},
				{2, 3}
		};
		assertEquals(2, counter.unhappyFriends(n, preferences, pair));
	}

	/**
	 * Input: n = 2, preferences = [[1], [0]], pairs = [[1, 0]]
	 */
	@Test
	void shouldReturn0() {
		CountUnhappyFriends counter = new CountUnhappyFriends();

		int n = 2;
		int [][] preferences = {
				{1},
				{0}
		};

		int [][] pair = {
				{1, 0},
		};
		assertEquals(0, counter.unhappyFriends(n, preferences, pair));
	}

	/**
	 * Input: n = 4, preferences = [[1, 3, 2], [2, 3, 0], [1, 3, 0], [0, 2, 1]], pairs = [[1, 3], [0, 2]]
	 * Output: 4
	 */
	@Test
	void shouldReturn4() {
		CountUnhappyFriends counter = new CountUnhappyFriends();

		int n = 4;
		int [][] preferences = {
				{1, 3, 2},
				{2, 3, 0},
				{1, 3, 0},
				{0, 2, 1}
		};

		int [][] pair = {
				{1, 3},
				{0, 2}
		};
		assertEquals(4, counter.unhappyFriends(n, preferences, pair));
	}
}