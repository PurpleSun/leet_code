package com.fanwei.zeng;

import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/generate-parentheses/
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> res = new LinkedList<>();
        parenthesis(res, n, n, new StringBuilder());
        return res;
    }

    public void parenthesis(List<String> res, int i, int j, StringBuilder sb) {
        if (i == 0 && j == 0) {
            res.add(sb.toString());
            return;
        }

        if (i == j) {
            parenthesis(res, i - 1, j, sb.append('('));
            sb.deleteCharAt(sb.length() - 1);
        } else if (i == 0) {
            parenthesis(res, i, j - 1, sb.append(')'));
            sb.deleteCharAt(sb.length() - 1);
        } else {
            parenthesis(res, i - 1, j, sb.append('('));
            sb.deleteCharAt(sb.length() - 1);
            parenthesis(res, i, j - 1, sb.append(')'));
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        GenerateParentheses solution = new GenerateParentheses();
        List<String> res = solution.generateParenthesis(2);
        System.out.println(res);
    }
}
