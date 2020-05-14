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

        long a = dividend;
        long b = divisor;
        boolean isMinus = false;
        if (a < 0) {
            isMinus = !isMinus;
            a = -a;
        }
        if (b < 0) {
            isMinus = !isMinus;
            b = -b;
        }

        int ret = 0;
        final int HALF_MAX = Integer.MAX_VALUE >> 1;
        while (a >= b) {
            int exponent = 0;
            long temp = b;
            while ((temp = temp << 1) < a) {
                exponent++;
                if (temp >= HALF_MAX) {
                    break;
                }
            }
            ret += 1 << exponent;
            a -= b << exponent;
        }

        if (isMinus) {
            return -ret;
        } else {
            return ret;
        }
    }

    public static void main(String[] args) {
        DivideTwoIntegers solution = new DivideTwoIntegers();
        System.out.println(solution.divide(10, 3));
        System.out.println(solution.divide(7, -3));
        System.out.println(solution.divide(1, 1));
        System.out.println(solution.divide(-2147483648, -1));
        System.out.println(solution.divide(-2147483648, 1));
        System.out.println(solution.divide(2147483647, 2));
        System.out.println(solution.divide(-2147483648, 2));
    }
}
