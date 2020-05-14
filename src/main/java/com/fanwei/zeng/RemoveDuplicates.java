package com.fanwei.zeng;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int repeated = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                repeated++;
            } else {
                nums[i + 1 - repeated] = nums[i + 1];
            }
        }
        return nums.length - repeated;
    }

    public static void main(String[] args) {
        RemoveDuplicates solution = new RemoveDuplicates();
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int ret = solution.removeDuplicates(nums);
        System.out.println(ret);
    }
}
