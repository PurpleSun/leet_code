package com.fanwei.zeng;

// https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix {
    private boolean isSame(String[] strs, int index) {
        char first = '\u0000';
        for (int i = 0; i < strs.length; i++) {
            if (index < strs[i].length()) {
                if (i == 0) {
                    first = strs[i].charAt(index);
                } else {
                    if (strs[i].charAt(index) != first) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        return first != '\u0000';

    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        int index = 0;
        while (true) {
            if (!this.isSame(strs, index)) {
                break;
            } else {
                index++;
            }
        }

        if (index == 0) {
            return "";
        } else {
            return strs[0].substring(0, index);
        }
    }
}
