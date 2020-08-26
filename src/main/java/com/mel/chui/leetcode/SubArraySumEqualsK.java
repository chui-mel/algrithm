package com.mel.chui.leetcode;

/**
 * https://leetcode.com/problems/subarray-sum-equals-k/
 * Subarray Sum Equals K
 * The length of the array is in range [1, 20,000].
 * The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].
 */
public class SubArraySumEqualsK {
	public int subarraySum(int[] nums, int k) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			for (int j = i; j <nums.length; j++) {
				sum += nums[j];
				if (sum == k) {
					count += 1;
				}
			}
		}
		return count;
	}
}
