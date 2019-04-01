package com.fanwei.zeng;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanToIntegerTest {

    @Test
    public void romanToInt() {
        RomanToInteger solution = new RomanToInteger();
        assertEquals(solution.romanToInt("MMMCMXCIX"), 3999);
    }
}