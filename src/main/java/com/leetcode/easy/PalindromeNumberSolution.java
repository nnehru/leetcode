package com.leetcode.easy;

public class PalindromeNumberSolution {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int revNum = 0, temp = x;
        while (temp != 0) {
            int digit = temp%10;
            revNum = revNum * 10 + digit;
            temp /= 10;
        }
        return revNum == x;
    }
}
