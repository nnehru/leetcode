package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramsInString {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> integerList = new ArrayList<>();
        char[] pArray = p.toCharArray();
        p = new String(pArray);
        for (int i = 0; i < s.length(); i++) {
            String substr = s.substring(i, p.length());
            char[] sArray = substr.toCharArray();
            Arrays.sort(sArray);
            Arrays.sort(pArray);
            substr = new String(sArray);
            if (substr.equals(p))
                integerList.add(i);
        }
        return integerList;
    }
}
