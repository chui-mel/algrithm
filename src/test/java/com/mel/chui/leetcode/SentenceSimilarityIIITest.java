package com.mel.chui.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentenceSimilarityIIITest {

	SentenceSimilarityIII solution = new SentenceSimilarityIII();

	@Test
	void areSentencesSimilar() {
		String sentenceOne = "Eating right now";
		String sentenceTwo = "Eating";

		assertTrue(solution.areSentencesSimilar(sentenceOne, sentenceTwo));
	}

	@Test
	void areSentencesSimilarMore() {
		String sentenceOne = "My name is Haley";
		String sentenceTwo = 	"My Haley";

		assertTrue(solution.areSentencesSimilar(sentenceOne, sentenceTwo));
	}

	@Test
	void areSentencesSimilarMoreMore() {
		String sentenceOne = "My name is Haley";
		String sentenceTwo = 	"My name is Haley";

		assertTrue(solution.areSentencesSimilar(sentenceOne, sentenceTwo));
	}

	@Test
	void falseExample() {
		String sentence1 = "of";
		String sentence2 = "A lot of words";

		assertFalse(solution.areSentencesSimilar(sentence1, sentence2));
	}
}