package com.mel.chui.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Sliding window
 */
public class LongestSubStrWithoutRepeating {
	public int lengthOfLongestSubstring(String s) {
		int length = s.length();

		Map<Character, Integer> subStrMap = new HashMap<>();

		int result = 0, i = 0, j = 0;
		while (i < length && j < length) {
			if (subStrMap.containsKey(s.charAt(j))) {
				i = Math.max(subStrMap.get(s.charAt(j)), i);
			}
			result = Math.max(result, j - i + 1);
			subStrMap.put(s.charAt(j), j + 1);

			j++;
		}

		return result;
	}
}
