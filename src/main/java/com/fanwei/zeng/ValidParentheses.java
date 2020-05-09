package com.fanwei.zeng;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
                continue;
            }
            if (stack.empty()) {
                return false;
            }
            Character x = stack.pop();
            if (x == null || (x == '{' && c != '}') || (x == '[' && c != ']') || (x == '(' && c != ')')) {
                return false;
            }
        }
        return stack.empty();
    }
}
