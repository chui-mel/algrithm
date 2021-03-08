package com.mel.chui.leetcode;

import java.util.*;
import java.util.stream.Collectors;

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

	public List<List<Integer>> sumThreeWithHashMap(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();

		List<Integer> calculatedI = new ArrayList<>();

		for (int i = 0; i < nums.length - 2; i++) {
			if (calculatedI.contains(nums[i])) {
				continue;
			}
			calculatedI.add(nums[i]);

			Map<Integer, Integer> map = new HashMap<>();
			for (int j = i + 1; j < nums.length; j++) {
				int remain = 0 - nums[i] - nums[j];
				if (map.containsKey(remain)) {
					List<Integer> oneGroup = Arrays.asList(nums[i], nums[j], remain);
					Collections.sort(oneGroup);
					result.add(oneGroup);
				}
				map.put(nums[j], j);
			}
		}

		return result.stream().distinct().collect(Collectors.toList());
	}
}
