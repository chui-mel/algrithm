package com.mel.chui.leetcode;

import java.util.*;

/**
 * https://leetcode.com/problems/sliding-window-maximum/
 */
public class SlidingWindowMax {
	public int[] maxSlidingWindow(int[] nums, int k) {
		if (nums.length < k) {
			return nums;
		}
		int n = nums.length;
		int[] r = new int[n - k + 1];

		int ri = 0;
		Deque<Integer> q = new ArrayDeque<>();
		for (int i = 0; i < nums.length; i++) {
			while (!q.isEmpty() && q.peek() < i - k + 1) {
				q.poll();
			}
			while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
				q.pollLast();
			}
			q.offer(i);
			if (i >= k - 1) {
				r[ri++] = nums[q.peek()];
			}
		}
		return r;
	}

	public int[] maxSlidingWindowTreeSet(int[] nums, int k) {
		if (nums.length < k) {
			return nums;
		}

		SortedSet<Integer> sortedSet = new TreeSet<>();

		Map<Integer, Integer> duplicated = new HashMap<>();
		List<Integer> maxList = new ArrayList<>();
		int left = 0, right = left + k - 1;
		for (int i = left; i <= right; i++) {
			sortedSet.add(nums[i]);
			duplicated.put(nums[i], duplicated.getOrDefault(nums[i], 0) + 1);
		}

		do {
			maxList.add(sortedSet.last());
			left += 1;
			right += 1;
			duplicated.put(nums[left - 1], duplicated.get(nums[left - 1]) - 1);
			if (duplicated.get(nums[left - 1]) == 0) {
				sortedSet.remove(nums[left - 1]);
			}
			if (right < nums.length) {
				sortedSet.add(nums[right]);
				duplicated.put(nums[right], duplicated.getOrDefault(nums[right], 0) + 1);
			}
		} while (right < nums.length);

		return maxList.stream().mapToInt(i -> i).toArray();
	}
}
