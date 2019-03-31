package com.fanwei.zeng;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringToIntegerTest {

    @Test
    public void myAtoi() {
        StringToInteger solution = new StringToInteger();
        assertEquals(solution.myAtoi("+42"), 42);
        assertEquals(solution.myAtoi("-42"), -42);
        assertEquals(solution.myAtoi("-a42"), 0);
        assertEquals(solution.myAtoi("4193 with words"), 4193);
        assertEquals(solution.myAtoi("words and 987"), 0);
        assertEquals(solution.myAtoi("-91283472332"), -2147483648);
        assertEquals(solution.myAtoi("  0000000000012345678"), 12345678);
        assertEquals(solution.myAtoi("-2147483648"), -2147483648);
        assertEquals(solution.myAtoi("0-1"), 0);
    }
}