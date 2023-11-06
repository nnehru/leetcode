package com.leetcode.easy;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.isEmpty() || t.isEmpty() ||s.length() != t.length()) {
            return false;
        }
        int[] intArr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            intArr[s.charAt(i) - 'a'] ++;
            intArr[t.charAt(i) - 'a']--;
        }
        for (int count : intArr) {
            if (count != 0)
                return false;
        }
        return true;
    }
}
