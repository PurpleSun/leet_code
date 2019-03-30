package com.fanwei.zeng;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseIntegerTest {

    @Test
    public void reverse() {
        ReverseInteger solution = new ReverseInteger();
        assertEquals(solution.reverse(421), 124);
        assertEquals(solution.reverse(0), 0);
        assertEquals(solution.reverse(420), 24);
        assertEquals(solution.reverse(-123), -321);
        assertEquals(solution.reverse(1534236469), 0);
        assertEquals(solution.reverse(123), 321);
        assertEquals(solution.reverse(-2147483648), 0);
    }
}