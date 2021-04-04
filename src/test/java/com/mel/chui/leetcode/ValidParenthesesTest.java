package com.mel.chui.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

	private ValidParentheses solution = new ValidParentheses();

	@Test
	void isValid() {
		assertTrue(solution.isValid("()"));
	}

	@Test
	void isNotValid() {
		assertFalse(solution.isValid("([)]"));
	}
}