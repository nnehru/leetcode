package com.leetcode.easy;

import java.util.Arrays;

public class ValidAnagramBestSoln {
    public boolean isAnagram(String s, String t) {
        if (s.isEmpty() || t.isEmpty() ||s.length() != t.length()) {
            return false;
        }
       char[] sArray = s.toCharArray();
       char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        s = new String(sArray);
        t = new String(tArray);
        return s.equals(t);
    }
}
