package com.mel.chui.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * In supermarket, merchants like to sell things in bundlers. For example, you can only by in 5 or 10 in one bundler.
 *
 * | Bundles example:
 * | ---------------
 * | A:  5 , 10
 * | B:  3 , 6 , 9
 * | C:  3 , 5 , 9
 *
 * ## Task
 * Given an order, you are required to determine the cost and bundle breakdown for each submission format.
 * For simplicity, each order should contain the minimal number of bundles.
 *
 */
public class BundleCalculatorDP {

	public FilledBundles calculate(int[] bundles, int total) {
		FilledBundles[] dp = initDpResults(bundles, total);

		for (int i = 1; i <= total; i++) {
			List<FilledBundles> tmpResults = new ArrayList<>();

			for (int value : bundles) {
				FilledBundles tmpResult;
				if (i > value) {
					tmpResult = new FilledBundles(i, dp[i - value]);
					tmpResult.addOneBundle(value);
				} else {
					tmpResult = new FilledBundles(i, dp[value]);
				}
				tmpResults.add(tmpResult);
			}

			Collections.sort(tmpResults);
			dp[i] = tmpResults.get(0);
		}

		return dp[total];
	}

	private FilledBundles[] initDpResults(int[] bundles, int total) {
		FilledBundles[] dp = new FilledBundles[total + 1];

		for (int i = 0; i <= total; i++) {
			dp[i] = new FilledBundles(i, bundles);
		}

		for (int value : bundles) {
			dp[value].addOneBundle(value);
		}

		return dp;
	}
}
