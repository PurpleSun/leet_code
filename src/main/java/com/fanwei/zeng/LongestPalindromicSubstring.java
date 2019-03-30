package com.fanwei.zeng;


// https://leetcode.com/problems/longest-palindromic-substring/
public class LongestPalindromicSubstring {
    private boolean isPalindromic(String s, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j - 1)) {
                return false;
            }
        }
        return true;
    }

    public String longestPalindrome(String s) {
        final int LENGTH = s.length();
        int maxLength = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < LENGTH; i++) {
            for (int j = i + 1 + maxLength; j <= LENGTH; j++) {
                if (this.isPalindromic(s, i, j)) {
                    maxLength = j - i;
                    start = i;
                    end = j;
                }
            }
        }
        return s.substring(start, end);
    }
}
