package com.fanwei.zeng;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int repeated = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                repeated++;
            } else {
                nums[i - repeated] = nums[i];
            }
        }
        return nums.length - repeated;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        RemoveElement solution = new RemoveElement();
        int ret = solution.removeElement(nums, 2);
        System.out.println(ret);
    }
}
