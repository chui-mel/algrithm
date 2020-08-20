package com.mel.chui.leetcode;

/**
 * 799. https://leetcode.com/problems/champagne-tower/
 */
public class ChampagneTower {

	public double champagneTower(int poured, int query_row, int query_glass) {

		double[][] cups = new double[101][101];

		cups[0][0] = poured;
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j <= i; j++) {
				if (cups[i][j] > 1) {
					cups[i + 1][j] += (cups[i][j] - 1)/2.0;
					cups[i + 1][j + 1] += (cups[i][j] - 1)/2.0;
				}
			}
			if (i == query_row) {
				break;
			}
		}

		return cups[query_row][query_glass] > 1 ? 1 : cups[query_row][query_glass];
	}
}
