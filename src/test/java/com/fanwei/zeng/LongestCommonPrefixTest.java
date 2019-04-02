package com.fanwei.zeng;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest {

    @Test
    public void longestCommonPrefix() {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        assertEquals(solution.longestCommonPrefix(new String[]{"flower","flow","flight"}), "fl");
        assertEquals(solution.longestCommonPrefix(new String[]{"","flow","flight"}), "");
        assertEquals(solution.longestCommonPrefix(new String[]{"dog","racecar","car"}), "");
        assertEquals(solution.longestCommonPrefix(new String[]{}), "");
        assertEquals(solution.longestCommonPrefix(new String[]{"dog"}), "dog");
    }
}