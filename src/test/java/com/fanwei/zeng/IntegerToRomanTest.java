package com.fanwei.zeng;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerToRomanTest {

    @Test
    public void intToRoman() {
        IntegerToRoman solution = new IntegerToRoman();
        assertEquals(solution.intToRoman(3999), "MMMCMXCIX");
    }
}