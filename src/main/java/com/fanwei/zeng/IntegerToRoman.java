package com.fanwei.zeng;

// https://leetcode.com/problems/integer-to-roman/
public class IntegerToRoman {
    final private String[] ONES_PLACE = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    final private String[] TENS_PLACE = new String[]{"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    final private String[] HUNDREDS_PLACE = new String[]{"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    final private String[] THOUSANDS_PLACE = new String[]{"M", "MM", "MMM"};

    public String intToRoman(int num) {
        final int LENGTH = String.valueOf(num).length();
        String[] encoded = new String[LENGTH];
        int i = 0;
        int quotient;
        byte remainder;
        while (true) {
            quotient = num / 10;
            remainder = (byte) (num % 10);
            if (remainder != 0) {
                if (i == 0) {
                    encoded[i] = ONES_PLACE[remainder - 1];
                } else if (i == 1) {
                    encoded[i] = TENS_PLACE[remainder - 1];
                } else if (i == 2) {
                    encoded[i] = HUNDREDS_PLACE[remainder - 1];
                } else if (i == 3) {
                    encoded[i] = THOUSANDS_PLACE[remainder - 1];
                } else {
                    // impossible case
                }
            }

            num = quotient;
            if (num == 0) {
                break;
            }
            i++;
        }

        StringBuilder sb = new StringBuilder(15);
        for (int j = LENGTH - 1; j >= 0; j--) {
            if (encoded[j] != null) {
                sb.append(encoded[j]);
            }
        }

        return sb.toString();
    }
}
