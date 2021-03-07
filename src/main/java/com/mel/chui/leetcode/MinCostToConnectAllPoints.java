package com.mel.chui.leetcode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://leetcode.com/contest/weekly-contest-206/problems/min-cost-to-connect-all-points/
 *
 * Not Minimum spanning tree Solution
 */
public class MinCostToConnectAllPoints {

	public int minCostConnectPoints(int[][] points) {

		int minCost = 0;

		Map<Integer, List<Integer>> maps = new HashMap<>();
		List<Integer> costs = new ArrayList<>();
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				int tmpCost = manhattanDistance(points[i][0], points[i][1], points[j][0], points[j][1]);
				costs.add(tmpCost);
				List<Integer> values = maps.getOrDefault(tmpCost, new ArrayList<>());
				values.addAll(List.of(i, j));
				maps.put(tmpCost, values);
			}
		}

		Collections.sort(costs);

		Map<Integer, List<Integer>> exists = new HashMap<>();
		int count = 0;
		int index = 0;
		while (count < points.length - 1 && index < costs.size()) {
			int tmpCost = costs.get(index);
			int tmpi = maps.get(tmpCost).remove(0);
			int tmpj = maps.get(tmpCost).remove(0);

			index++;

			if (exists.getOrDefault(tmpi, new ArrayList<>()).contains(tmpj)) {
				continue;
			}

			minCost += tmpCost;
			count += 1;

			List<Integer> connected = Stream.of(
					exists.getOrDefault(tmpi, new ArrayList<>()),
					exists.getOrDefault(tmpj, new ArrayList<>()),
					List.of(tmpi, tmpj))
					.flatMap(Collection::stream)
					.collect(Collectors.toList());

			connected.forEach(i ->
					exists.put(i, connected));

		}

		return minCost;
	}

	private int manhattanDistance(int x1, int y1, int x2, int y2) {
		return Math.abs(x1 - x2) + Math.abs(y1 - y2);
	}
}
