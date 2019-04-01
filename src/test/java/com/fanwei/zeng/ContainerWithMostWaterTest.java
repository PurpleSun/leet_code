package com.fanwei.zeng;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContainerWithMostWaterTest {

    @Test
    public void maxArea() {
        ContainerWithMostWater solution = new ContainerWithMostWater();
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        assertEquals(solution.maxArea(height), 49);
    }
}