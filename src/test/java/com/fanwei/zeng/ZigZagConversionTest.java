package com.fanwei.zeng;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZigZagConversionTest {

    @Test
    public void convert() {
        ZigZagConversion solution = new ZigZagConversion();
        assertEquals(solution.convert("PAYPALISHIRING", 3), "PAHNAPLSIIGYIR");
        assertEquals(solution.convert("PAYPALISHIRING", 4), "PINALSIGYAHRPI");
        assertEquals(solution.convert("A", 1), "A");
        assertEquals(solution.convert("AB", 2), "AB");
    }
}