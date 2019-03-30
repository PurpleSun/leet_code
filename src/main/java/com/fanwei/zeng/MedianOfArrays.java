package com.fanwei.zeng;

// https://leetcode.com/problems/median-of-two-sorted-arrays/
public class MedianOfArrays {
    private int[] merge(int[] arr1, int[] arr2) {
        if (arr1 == null && arr2 == null) {
            return null;
        }
        if (arr1 == null) {
            return arr2.clone();
        }
        if (arr2 == null) {
            return arr1.clone();
        }

        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, r = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[r] = arr1[i];
                i++;
            } else {
                merged[r] = arr2[j];
                j++;
            }
            r++;
        }

        if (i < arr1.length) {
            System.arraycopy(arr1, i, merged, r, (arr1.length - i));
        }
        if (j < arr2.length) {
            System.arraycopy(arr2, j, merged, r, (arr2.length - j));
        }
        return merged;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = this.merge(nums1, nums2);
        int length = merged.length;
        if (length % 2 == 0) {
            return (merged[length / 2 - 1] + merged[length / 2]) / 2.0f;
        } else {
            return merged[length / 2] / 1.0f;
        }
    }
}
