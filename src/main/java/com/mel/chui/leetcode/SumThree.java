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
			Map<Integer, Integer> map = new HashMap<>();
			for (int j = i + 1; j < nums.length; j++) {
				int remain = 0 - nums[i] - nums[j];
				if (map.containsKey(remain)) {
					List<Integer> oneGroup = List.of(nums[i], nums[j], remain);
					result.add(oneGroup);
				}
				map.put(nums[j], j);
			}
		}

		return result.stream().distinct().collect(Collectors.toList());
	}

	public List<List<Integer>> sumThreeBruceForce(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					if ((nums[i] + nums[j] + nums[k] == 0)
							&& !containsTriplet(result, List.of(nums[i], nums[j], nums[k]))) {
						result.add(List.of(nums[i], nums[j], nums[k]));
					}
				}
			}
		}
		return result;
	}

	private boolean containsTriplet(List<List<Integer>> source, List<Integer> data) {
		return source.stream()
				.filter( l -> l.containsAll(data) && data.containsAll(l))
				.count() != 0;
	}
}
