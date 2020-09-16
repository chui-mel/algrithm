package com.mel.chui.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/contest/weekly-contest-206/problems/count-unhappy-friends/
 *
 *
 * Constraints:
 *
 * 2 <= n <= 500
 * n is even.
 * preferences.length == n
 * preferences[i].length == n - 1
 * 0 <= preferences[i][j] <= n - 1
 * preferences[i] does not contain i.
 * All values in preferences[i] are unique.
 * pairs.length == n/2
 * pairs[i].length == 2
 * xi != yi
 * 0 <= xi, yi <= n - 1
 * Each person is contained in exactly one pai
 */
public class CountUnhappyFriends {
	public int unhappyFriends(int n, int[][] preferences, int[][] pairs) {
		int count = 0;

		Map<Integer, Integer> pairMap = new HashMap<>();
		for (int i = 0 ; i < n / 2; i++) {
			pairMap.put(pairs[i][0], pairs[i][1]);
			pairMap.put(pairs[i][1], pairs[i][0]);
		}

		for (int i = 0; i < n; i++) {
			int pair = pairMap.get(i);
			for (int j = 0; j < n-1; j++) {
				int prePair = preferences[i][j];
				if (prePair == pair) {
					break;
				}

				int preferedIndex = 0;
				int pairedIndex = 0;
				for (int k = 0; k < n-1; k++) {
					if (preferences[prePair][k] == i) {
						preferedIndex = k;
					} else if (preferences[prePair][k] == pairMap.get(prePair)) {
						pairedIndex = k;
					}
				}
				if (pairedIndex > preferedIndex) {
					count++;
					break;
				}
			}
		}

		return count;
	}
}
