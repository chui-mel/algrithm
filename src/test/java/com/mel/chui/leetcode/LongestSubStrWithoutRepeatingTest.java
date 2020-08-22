package com.mel.chui.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubStrWithoutRepeatingTest {

	LongestSubStrWithoutRepeating l = new LongestSubStrWithoutRepeating();

	@Test
	void lengthOfLongestSubstring() {
		assertEquals(3, l.lengthOfLongestSubstring("abcabcbb"));
		assertEquals(1, l.lengthOfLongestSubstring("bbbbb"));
		assertEquals(3, l.lengthOfLongestSubstring("pwwkew"));
	}
}