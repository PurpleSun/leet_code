package com.fanwei.zeng;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidParenthesesTest {

    @Test
    public void isValid() {
        ValidParentheses solution = new ValidParentheses();
        assertTrue(solution.isValid(""));
        assertTrue(solution.isValid("()"));
        assertTrue(solution.isValid("()[]{}"));
        assertTrue(solution.isValid("{[]}"));

        assertFalse(solution.isValid("(]"));
        assertFalse(solution.isValid("([)]"));

        assertFalse(solution.isValid("["));
        assertFalse(solution.isValid("(("));
        assertFalse(solution.isValid("){"));
    }
}