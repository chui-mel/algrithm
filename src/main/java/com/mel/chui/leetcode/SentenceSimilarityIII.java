package com.mel.chui.leetcode;

import java.util.ArrayDeque;
import java.util.Arrays;

/**
 * https://leetcode.com/problems/sentence-similarity-iii/
 */

public class SentenceSimilarityIII {
	public boolean areSentencesSimilar(String sentence1, String sentence2) {
		String[] sentence1Array = sentence1.split(" ");
		String[] sentence2Array = sentence2.split(" ");

		ArrayDeque<String> sentenceOneDeque = new ArrayDeque<>(Arrays.asList(sentence1Array));
		ArrayDeque<String> sentenceTwoDeque = new ArrayDeque<>(Arrays.asList(sentence2Array));

		while (sentenceOneDeque.peek() != null && sentenceOneDeque.peek().equals(sentenceTwoDeque.peek())) {
			sentenceOneDeque.poll();
			sentenceTwoDeque.poll();
		}

		while(sentenceOneDeque.peekFirst() != null && sentenceOneDeque.peekLast().equals(sentenceTwoDeque.peekLast())) {
			sentenceOneDeque.pollLast();
			sentenceTwoDeque.pollLast();
		}

		return sentenceOneDeque.size() == 0 || sentenceTwoDeque.size() == 0;
	}
}
