package com.mel.chui.leetcode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/min-stack/
 */

public class MinStack {

	private Deque<Integer> data;

	/** initialize your data structure here. */
	public MinStack() {
		data = new LinkedList<>();
	}

	public void push(int x) {
		data.push(x);
	}

	public void pop() {
		data.pollFirst();
	}

	public int top() {
		return data.peek();
	}

	public int getMin() {
		return data.stream().mapToInt(i -> i).min().getAsInt();
	}


	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> words = new HashMap<>();

		for (int i = 0; i < strs.length; i++) {
			char[] tmp = strs[i].toCharArray();
			Arrays.sort(tmp);
			List<String> anagrams = words.getOrDefault(String.copyValueOf(tmp), new ArrayList<>());
			anagrams.add(strs[i]);
			words.put(String.copyValueOf(tmp), anagrams);
		}

		return words.values().stream().collect(Collectors.toList());
	}
}
