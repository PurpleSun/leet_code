package com.fanwei.zeng;

// https://leetcode.com/problems/container-with-most-water/
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        final int LENGTH = height.length;
        int area = 0;
        int w;
        int h;
        int temp;
        for (int i = 0; i < LENGTH - 1; i++) {
            for (int j = i + 1; j < LENGTH; j++) {
                w = (j - i);
                if (height[i] < height[j]) {
                    h = height[i];
                } else {
                    h = height[j];
                }
                temp = w * h;
                if (temp > area) {
                    area = temp;
                }
            }
        }

        return area;
    }
}
