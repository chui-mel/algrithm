package com.mel.chui.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/plus-one/
 * 2020-08-16
 *
 * Where can improve: return early if digits[i] < 9
 */

public class PlusOneSolution {
	public int[] plusOne(int[] digits) {

		List<Integer> result = new ArrayList<>();
		int carry = 1;

		for (int i = digits.length - 1; i >= 0; i--) {
			result.add(0, (digits[i] + carry) % 10);
			carry = (digits[i] + carry) / 10;
		}

		if (carry > 0) {
			result.add(0, carry);
		}

		return result.stream().mapToInt(i->i).toArray();
	}
}
