package com.fanwei.zeng;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        final byte DECIMAL_10 = 10;
        byte[] array = new byte[11];
        byte j = 0;
        int quotient;
        byte remainder;
        while (true) {
            quotient = x / DECIMAL_10;
            remainder = (byte) (x % DECIMAL_10);
            array[j] = remainder;
            j++;

            x = quotient;
            if (x == 0) {
                break;
            }
        }

        for (int low = 0, high = j - 1; low < high; low++, high--) {
            if (array[low] != array[high]) {
                return false;
            }
        }
        return true;
    }
}
