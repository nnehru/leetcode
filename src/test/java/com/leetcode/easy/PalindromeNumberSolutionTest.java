package com.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeNumberSolutionTest {

    private PalindromeNumberSolution palindromeNumberSolution = new PalindromeNumberSolution();


   @Test
    void shouldExecuteExample1() {
        Assertions.assertTrue(palindromeNumberSolution.isPalindrome(121));
    }

    @Test
    void shouldExecuteExample2() {
        Assertions.assertFalse(palindromeNumberSolution.isPalindrome(-121));
    }

    @Test
    void shouldExecuteExample3() {
        Assertions.assertFalse(palindromeNumberSolution.isPalindrome(10));
    }

}