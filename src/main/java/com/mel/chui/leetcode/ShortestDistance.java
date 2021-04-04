package com.mel.chui.leetcode;

/**
 * https://leetcode.com/problems/shortest-distance-to-a-character/
 */
public class ShortestDistance {
	public int[] shortestToChar(String s, char c) {
		char[] charArray = s.toCharArray();

		int[] result = new int[charArray.length];

		int left = -1, right = 0;
		while (right < charArray.length) {
			while (right < charArray.length && charArray[right] != c) {
				right++;
			}
			for (int i = Math.max(left, 0); i < Math.min(right, charArray.length); i++) {
				result[i] = left == -1 ? right - i
						: right >= charArray.length ? i - left : Math.min(i - left, right - i);
			}
			left = right;
			right = left + 1;
		}

		return result;
	}
}
