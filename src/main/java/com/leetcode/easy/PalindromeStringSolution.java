package com.leetcode.easy;

public class PalindromeStringSolution {

    public boolean isPalindrome(String str) {
        
        if (str == null || str.isEmpty()) {
            return false;
        }

        char[] chars = str.toCharArray();
        int i = 0, j = chars.length - 1;
        while (i < j) {
            if (chars[i] != chars[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
