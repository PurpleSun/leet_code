package com.fanwei.zeng;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromicSubstringTest {

    @Test
    public void longestPalindrome() {
        LongestPalindromicSubstring solution = new LongestPalindromicSubstring();
        assertEquals(solution.longestPalindrome("abcdefedcba"), "abcdefedcba");
        assertEquals(solution.longestPalindrome("cbbd"), "bb");
        assertEquals(solution.longestPalindrome(""), "");

    }
}