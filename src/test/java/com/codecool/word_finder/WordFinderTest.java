package com.codecool.word_finder;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WordFinderTest {

    @Test
    void getWordCount_wordRace_returns41() {
        WordFinder wordFinder = new WordFinder();
        Map<String, Integer> result = wordFinder.getWordCount("race");

        assertEquals(41, result.get("race"));
    }

    @Test
    void getWordCount_wordAcre_returns30() {
        WordFinder wordFinder = new WordFinder();
        Map<String, Integer> result = wordFinder.getWordCount("acre");

        assertEquals(30, result.get("acre"));
    }

    @Test
    void getWordCount_wordApple_returns0() {
        WordFinder wordFinder = new WordFinder();
        Map<String, Integer> result = wordFinder.getWordCount("apple");
        assertEquals(0, result.get("apple"));
    }

    @Test
    void getWordCount_notFoundWord_throwsIllegalArgumentException() {
        WordFinder wordFinder = new WordFinder();

        assertThrows(IllegalArgumentException.class, () -> {
            wordFinder.getWordCount(null);
        });
    }
}