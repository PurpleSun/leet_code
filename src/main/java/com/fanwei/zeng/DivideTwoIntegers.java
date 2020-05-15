package com.fanwei.zeng;

// https://leetcode.com/problems/divide-two-integers/
public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if (divisor == -1) {
            return (dividend == Integer.MIN_VALUE) ? Integer.MAX_VALUE : -dividend;
        }
        if (divisor == 1) {
            return dividend;
        }

        long x = dividend;
        long y = divisor;
        boolean isMinus = false;
        if (x < 0) {
            isMinus = !isMinus;
            x = -x;
        }
        if (y < 0) {
            isMinus = !isMinus;
            y = -y;
        }

        int ret = 0;
        while (x >= y) {
            int exponent = 0;
            long temp = y;
            while ((temp = temp << 1) < x) {
                exponent++;
            }
            ret += 1 << exponent;
            x -= y << exponent;
        }

        if (isMinus) {
            return -ret;
        } else {
            return ret;
        }
    }

    public static void main(String[] args) {
        DivideTwoIntegers solution = new DivideTwoIntegers();
        System.out.println(solution.divide(9, 3));
        System.out.println(solution.divide(7, -3));
        System.out.println(solution.divide(1, 1));
        System.out.println(solution.divide(-2147483648, -1));
        System.out.println(solution.divide(-2147483648, 1));
        System.out.println(solution.divide(2147483647, 2));
        System.out.println(solution.divide(-2147483648, 2));
    }
}
