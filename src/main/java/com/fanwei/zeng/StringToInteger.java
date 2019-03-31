package com.fanwei.zeng;

public class StringToInteger {
    private void print(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != '\u0000') {
                System.out.printf("%c", array[i]);
            }
        }
        System.out.println();
    }

    public int myAtoi(String str) {
        if (str == null) {
            return 0;
        }

        final char POSITIVE_SIGN = '+';
        final char NEGATIVE_SIGN = '-';
        final short MAX_LENGTH = 11;

        int length = str.length();
        if (length == 0) {
            return 0;
        } else if (length > MAX_LENGTH) {
            length = MAX_LENGTH;
        }

        boolean startParse = false;
        char[] array = new char[length];
        int j = 0;
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (!startParse) {
                if (c == POSITIVE_SIGN || c == NEGATIVE_SIGN || Character.isDigit(c)) {
                    startParse = true;
                    if (c == '0') {
                        continue;
                    }
                    array[j] = c;
                    j++;
                } else if (Character.isWhitespace(c)) {
                } else {
                    return 0;
                }
            } else {
                if (Character.isDigit(c)) {
                    if (c == '0') {
                        if (j == 0) {
                            continue;
                        } else if (j == 1 && (array[0] == NEGATIVE_SIGN || array[0] == POSITIVE_SIGN)) {
                            continue;
                        }
                    }

                    if (j >= length) {
                        if (array[0] == NEGATIVE_SIGN) {
                            return Integer.MIN_VALUE;
                        } else {
                            return Integer.MAX_VALUE;
                        }
                    }
                    array[j] = c;
                    j++;
                } else {
                    break;
                }
            }
        }

        long ret = 0;
        for (int i = j - 1; i >= 0; i--) {
            if (Character.isDigit(array[i])) {
                ret += Character.getNumericValue(array[i]) * Math.pow(10, j - i - 1);
                if (ret > Integer.MAX_VALUE) {
                    if (array[0] == NEGATIVE_SIGN) {
                        return Integer.MIN_VALUE;
                    } else {
                        return Integer.MAX_VALUE;
                    }
                }
            } else if (array[i] == NEGATIVE_SIGN) {
                ret = -ret;
            } else {
            }
        }

        str = null;
        return (int) ret;
    }

    public static void main(String[] args) {

    }

}
