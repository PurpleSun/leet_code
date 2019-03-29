package com.fanwei.zeng;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TwoSumTest {

    @Test
    public void twoSum() {
        TwoSum solution = new TwoSum();
        assertTrue(Arrays.equals(solution.twoSum(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1}));
        assertTrue(Arrays.equals(solution.twoSum(new int[]{11, 15, 2, 7}, 9), new int[]{2, 3}));
    }
}