package com.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramsInStringTest {

    AnagramsInString anagramsInString = new AnagramsInString();

    @Test
    void example1() {
       anagramsInString.findAnagrams("cbaebabacd", "abc");
    }

}