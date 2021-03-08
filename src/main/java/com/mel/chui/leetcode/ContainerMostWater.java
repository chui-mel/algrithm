package com.mel.chui.leetcode;

/**
 * https://leetcode.com/problems/container-with-most-water/
 */
public class ContainerMostWater {

	public int maxArea(int[] height) {

		int result = 0;
		int left = 0, right = height.length - 1;

		while (left <= right) {
			result = Math.max(result, Math.min(height[left], height[right]) * (right - left));

			if (height[left] <= height[right]) {
				left ++;
			} else {
				right --;
			}
		}

		return result;
	}
}
