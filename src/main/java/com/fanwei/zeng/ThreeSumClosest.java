package com.fanwei.zeng;

import java.util.Arrays;

// https://leetcode.com/problems/3sum-closest/
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        Integer res = null;
        Integer minDistance = null;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int low = i + 1, high = nums.length - 1; low < high; ) {
                int sum = nums[i] + nums[low] + nums[high];
                int distance = Math.abs(target - sum);
                if (minDistance == null || distance < minDistance) {
                    res = sum;
                    minDistance = distance;
                }
                if (sum > target) {

                    high--;
                } else if (sum < target) {
                    low++;
                } else {
                    return target;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, -1, -1, 3};
        int target = -1;
        ThreeSumClosest sumClosest = new ThreeSumClosest();
        int sum = sumClosest.threeSumClosest(nums, target);
        System.out.println(sum);
    }
}
