package com.fanwei.zeng;


// https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongestSubstring {
    private boolean hasNoRepeating(String s) {
        final int LENGTH = s.length();
        for (int i = 0; i < LENGTH - 1; i++) {
            for (int j = i + 1; j < LENGTH; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        final int LENGTH = s.length();
        String sub;
        for (int i = 0; i < LENGTH; i++) {
            for (int j = i + 1 + maxLength; j <= LENGTH; j++) {
                sub = s.substring(i, j);
                if (this.hasNoRepeating(sub)) {
                    if (sub.length() > maxLength) {
                        maxLength = sub.length();
                    }
                } else {
                    break;
                }
            }
        }
        return maxLength;
    }
}
