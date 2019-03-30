package com.fanwei.zeng;

import org.junit.Test;

import static org.junit.Assert.*;

public class MedianOfArraysTest {

    @Test
    public void findMedianSortedArrays() {
        MedianOfArrays solution = new MedianOfArrays();
        assertTrue(solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}) == 2.0f);
        assertTrue(solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}) == 2.5f);
    }
}