package com.fanwei.zeng;

import java.util.*;

// https://leetcode.com/problems/4sum/
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    if (left - 1 > j && nums[left] == nums[left - 1]) {
                        left++;
                        continue;
                    }
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        // sum > target
                        right--;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-3, -2, -1, 0, 0, 1, 2, 3};
        FourSum solution = new FourSum();
        System.out.println(solution.fourSum(nums, 0));
    }
}
