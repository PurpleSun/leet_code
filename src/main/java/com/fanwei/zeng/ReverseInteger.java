package com.fanwei.zeng;

// https://leetcode.com/problems/reverse-integer/
public class ReverseInteger {
    public int reverse(int x) {
        final boolean POSITIVE = x > 0;
        if (!POSITIVE) {
            long y = Math.abs((long) x);
            if (y > Integer.MAX_VALUE) {
                return 0;
            } else {
                x = (int) y;
            }
        }

        final int DECIMAL_10 = 10;
        final int LENGTH = String.valueOf(x).length();
        int[] array = new int[LENGTH];
        int quotient;
        int remainder;
        int i = 0;
        while (true) {
            quotient = x / DECIMAL_10;
            remainder = x % DECIMAL_10;
            array[i] = remainder;
            x = quotient;
            i++;
            if (x == 0) {
                break;
            }
        }

        int ret = 0;
        double temp;
        for (int j = LENGTH - 1; j >= 0; j--) {
            temp = ret + (array[j] * Math.pow(DECIMAL_10, LENGTH - j - 1));
            if (temp > Integer.MAX_VALUE) {
                return 0;
            } else {
                ret = (int) temp;
            }
        }

        if (POSITIVE) {
            return ret;
        } else {
            return -ret;
        }
    }
}
