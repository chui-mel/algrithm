package com.mel.chui.leetcode;

import java.util.Arrays;

public class MaxThreeProduct {
	public int maximumProduct(int[] nums) {
		Arrays.sort(nums);

		int result = 0;
		if (nums[0] < 0 && nums[1] < 0 &&  nums[nums.length - 1] > 0) {
			result = nums[0] * nums[1] * nums[nums.length - 1];
		}
		return Math.max(result, nums[nums.length - 3] * nums[nums.length - 2] * nums[nums.length - 1]);
	}

	public int maximumProductBruteForce(int[] nums) {
		int result = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					result = Math.max(result, nums[i] * nums[j] * nums[k]);
				}
			}
		}

		return result;
	}
}
