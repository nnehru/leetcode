package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    private ValidAnagram validAnagram = new ValidAnagram();

    @Test
    void shouldBeValidAnagram() {
        String s = "anagram", t = "nagaram";
        assertTrue(validAnagram.isAnagram(s, t));
    }

    @Test
    void shouldBeInValidAnagram() {
        String s = "rat", t = "car";
        assertFalse(validAnagram.isAnagram(s, t));
    }

}