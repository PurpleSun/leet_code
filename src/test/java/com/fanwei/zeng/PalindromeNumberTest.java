package com.fanwei.zeng;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeNumberTest {

    @Test
    public void isPalindrome() {
        PalindromeNumber solution = new PalindromeNumber();
        assertTrue(solution.isPalindrome(121));
        assertTrue(solution.isPalindrome(1221));
        assertTrue(solution.isPalindrome(12221));
        assertTrue(solution.isPalindrome(0));
        assertTrue(solution.isPalindrome(1));
        assertTrue(solution.isPalindrome(2));

        assertFalse(solution.isPalindrome(-1));
        assertFalse(solution.isPalindrome(-12));
        assertFalse(solution.isPalindrome(-13));
        assertFalse(solution.isPalindrome(-14));
        assertFalse(solution.isPalindrome(-151));

        assertFalse(solution.isPalindrome(152));
        assertFalse(solution.isPalindrome(153));
        assertFalse(solution.isPalindrome(12332));

        assertFalse(solution.isPalindrome(2147483647));
    }
}