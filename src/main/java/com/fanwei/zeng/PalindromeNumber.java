package com.fanwei.zeng;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        final byte DECIMAL_10 = 10;
        byte[] array = new byte[11];
        byte j = 0;
        int y = x;
        int quotient;
        byte remainder;
        while (true) {
            quotient = y / DECIMAL_10;
            remainder = (byte) (y % DECIMAL_10);
            array[j] = remainder;
            j++;

            y = quotient;
            if (y == 0) {
                break;
            }
        }

        long reversed = 0;
        for (int i = j - 1; i >= 0; i--) {
            reversed += array[i] * Math.pow(DECIMAL_10, j - i - 1);
        }
        return x == reversed;
    }
}
