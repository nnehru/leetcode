package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeStringSolutionTest {

    private PalindromeStringSolution palindromeStringSolution = new PalindromeStringSolution();

    @Test
    void shouldBeFalseWhenEmptyString() {
        assertFalse(palindromeStringSolution.isPalindrome(""));
    }

    @Test
    void shouldBeFalseWhenNotPalindrome() {
        assertFalse(palindromeStringSolution.isPalindrome("ABBAC"));
    }

    @Test
    void shouldBeTrueWhenPalindrome() {
        assertTrue(palindromeStringSolution.isPalindrome("ABBA"));
    }

}