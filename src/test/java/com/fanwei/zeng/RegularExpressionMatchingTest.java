package com.fanwei.zeng;

import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionMatchingTest {

    @Test
    public void match() {
//        RegularExpressionMatching solution = new RegularExpressionMatching();
//        assertFalse(solution.match("", "."));
//        assertTrue(solution.match("a", "."));
//        assertTrue(solution.match("b", "."));
//        assertTrue(solution.match("c", "."));
//        assertTrue(solution.match("c", "."));
//        assertFalse(solution.match("ab", "."));
//        assertFalse(solution.match("abc", "."));

//        assertTrue(solution.match("", "*"));
//        assertTrue(solution.match("a", "*"));
//        assertTrue(solution.match("aa", "*"));
//        assertTrue(solution.match("aaa", "*"));
//        assertTrue(solution.match("aaaa", "*"));
//        assertFalse(solution.match("ab", "*"));
//        assertFalse(solution.match("abc", "*"));
    }

    @Test
    public void isMatch() {
        RegularExpressionMatching solution = new RegularExpressionMatching();
        assertFalse(solution.isMatch("aa", "a"));
        assertTrue(solution.isMatch("aa", "a*"));
        assertTrue(solution.isMatch("ab", ".*"));
        assertTrue(solution.isMatch("aab", "c*a*b"));
        assertFalse(solution.isMatch("mississippi", "mis*is*p*"));
        assertTrue(solution.isMatch("aaa", "a*"));
        assertTrue(solution.isMatch("aaa", "a*a"));
        assertTrue(solution.isMatch("aaa", "ab*a*c*a"));
        assertTrue(solution.isMatch("a", "ab*"));
        assertTrue(solution.isMatch("ab", ".*.."));
        assertTrue(solution.isMatch("aaa", ".*"));
        assertTrue(solution.isMatch("bbbba", ".*"));
        assertTrue(solution.isMatch("a", "a*a"));
        assertTrue(solution.isMatch("bbbba", ".*a*a"));
        assertTrue(solution.isMatch("abbbcd", "ab*bbbcd"));

        assertTrue(solution.isMatch("abbbaabccbaabacab", "ab*b*b*bc*ac*.*bb*"));
    }
}