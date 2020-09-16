package com.mel.chui.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/contest/weekly-contest-206/problems/special-positions-in-a-binary-matrix/
 *
 * Constraints:
 * rows == mat.length
 * cols == mat[i].length
 * 1 <= rows, cols <= 100
 * mat[i][j] is 0 or 1.
 */
public class SpecialPosition {
	public int numSpecial(int[][] mat) {

		Map<Integer, List<Integer>> rowCounts = new HashMap<>();
		Map<Integer, Integer> colCounts = new HashMap<>();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == 1) {
					List<Integer> numbers = rowCounts.getOrDefault(i, new ArrayList<>());
					numbers.add(j);
					rowCounts.put(i, numbers);
					colCounts.put(j, 1 + colCounts.getOrDefault(j, 0));
				}
			}
		}

		return (int) rowCounts.values().stream()
				.filter(l -> l.size() == 1)
				.filter(l -> colCounts.get(l.get(0)) == 1)
				.count();
	}
}
