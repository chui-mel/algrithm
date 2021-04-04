package com.mel.chui.leetcode;

import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParentheses {
	private final static Map<Character, Character> PAIR_CHARACTERS =
			Map.of('(', ')', '{', '}', '[', ']');

	public boolean isValid(String s) {
		Set<Character> leftParts = PAIR_CHARACTERS.keySet();

		Stack<Character> stacks = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);
			if (leftParts.contains(current)) {
				stacks.push(current);
			} else {
				if (stacks.empty() || PAIR_CHARACTERS.get(stacks.pop()) != current) {
					return false;
				}
			}
		}

		return stacks.empty();
	}
}
