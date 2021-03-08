package com.mel.chui.leetcode;

import java.util.*;

/**
 * https://leetcode.com/problems/3sum/
 */
public class SumThree {
	public List<List<Integer>> sumThree(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < nums.length - 2; i++) {
    	if (i >= 1 && nums[i] == nums[i-1]) {
    		continue;
			}

    	int left = i + 1, right = nums.length - 1;
    	boolean loop = true;
    	while (left < right && loop) {
				if (nums[left] + nums[right] + nums[i] == 0) {
					result.add(List.of(nums[i], nums[left], nums[right]));
					while (left < right && nums[left] == nums[left + 1]) left += 1;
					while (left < right && nums[right] == nums[right - 1]) right -= 1;
					left += 1;
					right -= 1;
				} else if (nums[left] + nums[right] + nums[i] > 0) {
					right -= 1;
				} else {
					left += 1;
				}
			}
		}

		return result;
	}
}
