package com.mel.chui.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinCostToConnectAllPointsTest {

	@BeforeEach
	void setUp() {
	}

	@Test
	void minCostConnectPoints() {
		int[][] points = {
				{0, 0},
				{2, 2},
				{3, 10},
				{5, 2},
				{7, 0}};

		MinCostToConnectAllPoints fun = new MinCostToConnectAllPoints();
		assertEquals(20, fun.minCostConnectPoints(points));
	}

	@Test
	void minCostConnectPointsForNegtive() {
		int[][] points = {
				{3, 12}, {-2, 5}, {-4, 1}};

		MinCostToConnectAllPoints fun = new MinCostToConnectAllPoints();
		assertEquals(18, fun.minCostConnectPoints(points));
	}

	@Test
	void bigDistance() {
		int[][] points = {{-1000000, -1000000}, {1000000, 1000000}};
		MinCostToConnectAllPoints fun = new MinCostToConnectAllPoints();
		assertEquals(4000000, fun.minCostConnectPoints(points));
	}

	@Test
	void onePoint() {
		int[][] points = {{0, 0}};
		MinCostToConnectAllPoints fun = new MinCostToConnectAllPoints();
		assertEquals(0, fun.minCostConnectPoints(points));
	}

	@Test
	void moreTests() {
		int[][] points = {{0, 0}, {1, 1}, {1, 0}, {-1, 1}};
		MinCostToConnectAllPoints fun = new MinCostToConnectAllPoints();
		assertEquals(4, fun.minCostConnectPoints(points));
	}

	@Test
	void failedTest() {
		int[][] points = {{2, -3}, {-17, -8}, {13, 8}, {-17, -15}};
		MinCostToConnectAllPoints fun = new MinCostToConnectAllPoints();
		assertEquals(53, fun.minCostConnectPoints(points));
	}
}