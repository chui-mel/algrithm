package com.mel.chui.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChampagneTowerTest {
	ChampagneTower champagneTower;

	@BeforeEach
	void setUp() {
		champagneTower = new ChampagneTower();
	}

	@Test
	void champagneTower() {
    assertEquals(1, champagneTower.champagneTower(20, 1, 1));
    assertEquals(0.5, champagneTower.champagneTower(2, 1, 1));
	}
}