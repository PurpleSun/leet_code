package com.fanwei.zeng;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ThreeSumTest {

    @Test
    public void threeSum() {
        ThreeSum solution = new ThreeSum();
        List<List<Integer>> res = new ArrayList<>();
        res.add(Arrays.asList(-1, -1, 2));
        res.add(Arrays.asList(-1, 0, 1));
        assertEquals(solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4}), res);
    }
}