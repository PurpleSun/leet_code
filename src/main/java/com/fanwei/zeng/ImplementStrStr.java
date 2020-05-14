package com.fanwei.zeng;

// https://leetcode.com/problems/implement-strstr/
public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            String sub = haystack.substring(i, i + needle.length());
            if (sub.equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ImplementStrStr solution = new ImplementStrStr();
        System.out.println(solution.strStr("hello", "ll"));
        System.out.println(solution.strStr("a", "a"));
        System.out.println(solution.strStr("", ""));
    }
}
