package com.mel.chui.challenge;

import java.util.HashMap;
import java.util.Map;

public class FilledBundles implements Comparable<FilledBundles> {

	private final int number;

	private final Map<Integer, Integer> result = new HashMap<>();

	public FilledBundles(int number, int[] bundles) {
		this.number = number;
		for (int value : bundles) {
			result.put(value, 0);
		}
	}

	public FilledBundles(int number, FilledBundles filledBundles) {
		this.number = number;
		this.result.putAll(filledBundles.result);
	}

	public void addOneBundle(int bundle) {
		result.put(bundle, result.get(bundle) + 1);
	}

	private int totalAmount() {
		return result.entrySet().stream()
				.map(e -> e.getKey() * e.getValue())
				.mapToInt(Integer::intValue).sum();
	}

	private int totalBundleAmount() {
		return result.values().stream().mapToInt(Integer::intValue).sum();
	}

	public int getBundleAmount(int bundle) {
		return result.get(bundle);
	}

	@Override
	public int compareTo(FilledBundles o) {
		if (totalAmount() <= o.totalAmount()
				&& totalBundleAmount() <= o.totalBundleAmount()) {
			return -1;
		}
		return 1;
	}

	@Override
	public String toString() {
		return "FilledBundles{" +
				"number=" + number +
				", result=" + result +
				'}';
	}
}
