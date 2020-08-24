package com.mel.chui.leetcode;

/**
 * https://leetcode.com/problems/container-with-most-water/
 */
public class MostWaterContainer {
	public int maxArea(int[] height) {
		int left = 0, right = height.length - 1;

		int result = 0;
		while (left < right) {
			result = Math.max(result, Math.min(height[left], height[right]) * (right - left));

			if ((height[left] < height[right])) {
				left += 1;
			} else {
				right -= 1;
			}
		}

		return result;
	}
}
