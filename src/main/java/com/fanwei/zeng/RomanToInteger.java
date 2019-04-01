package com.fanwei.zeng;

// https://leetcode.com/problems/roman-to-integer/
public class RomanToInteger {
    private final static char I = 'I';
    private final static char V = 'V';
    private final static char X = 'X';
    private final static char L = 'L';
    private final static char C = 'C';
    private final static char D = 'D';
    private final static char M = 'M';

    private int parseThousand(String s) {
        final byte LENGTH = (byte) s.length();
        if (LENGTH >= 3 && s.charAt(0) == M && s.charAt(1) == M && s.charAt(2) == M) {
            return 3000 + this.parseHundred(s.substring(3, LENGTH));
        } else if (LENGTH >= 2 && s.charAt(0) == M && s.charAt(1) == M) {
            return 2000 + this.parseHundred(s.substring(2, LENGTH));
        } else if (LENGTH >= 1 && s.charAt(0) == M) {
            return 1000 + this.parseHundred(s.substring(1, LENGTH));
        } else {
            return this.parseHundred(s);
        }
    }

    private int parseHundred(String s) {
        final byte LENGTH = (byte) s.length();
        if (LENGTH >= 2 && s.charAt(0) == C && s.charAt(1) == M) {
            return 900 + this.parseTen(s.substring(2, LENGTH));
        } else if (LENGTH >= 4 && s.charAt(0) == D && s.charAt(1) == C && s.charAt(2) == C && s.charAt(3) == C) {
            return 800 + this.parseTen(s.substring(4, LENGTH));
        } else if (LENGTH >= 3 && s.charAt(0) == D && s.charAt(1) == C && s.charAt(2) == C) {
            return 700 + this.parseTen(s.substring(3, LENGTH));
        } else if (LENGTH >= 2 && s.charAt(0) == D && s.charAt(1) == C) {
            return 600 + this.parseTen(s.substring(2, LENGTH));
        } else if (LENGTH >= 1 && s.charAt(0) == D) {
            return 500 + this.parseTen(s.substring(1, LENGTH));
        } else if (LENGTH >= 2 && s.charAt(0) == C && s.charAt(1) == D) {
            return 400 + this.parseTen(s.substring(2, LENGTH));
        } else if (LENGTH >= 3 && s.charAt(0) == C && s.charAt(1) == C && s.charAt(2) == C) {
            return 300 + this.parseTen(s.substring(3, LENGTH));
        } else if (LENGTH >= 2 && s.charAt(0) == C && s.charAt(1) == C) {
            return 200 + this.parseTen(s.substring(2, LENGTH));
        } else if (LENGTH >= 1 && s.charAt(0) == C) {
            return 100 + this.parseTen(s.substring(1, LENGTH));
        } else {
            return this.parseTen(s);
        }
    }

    private int parseTen(String s) {
        final byte LENGTH = (byte) s.length();
        if (LENGTH >= 2 && s.charAt(0) == X && s.charAt(1) == C) {
            return 90 + this.parseOne(s.substring(2, LENGTH));
        } else if (LENGTH >= 4 && s.charAt(0) == L && s.charAt(1) == X && s.charAt(2) == X && s.charAt(3) == X) {
            return 80 + this.parseOne(s.substring(4, LENGTH));
        } else if (LENGTH >= 3 && s.charAt(0) == L && s.charAt(1) == X && s.charAt(2) == X) {
            return 70 + this.parseOne(s.substring(3, LENGTH));
        } else if (LENGTH >= 2 && s.charAt(0) == L && s.charAt(1) == X) {
            return 60 + this.parseOne(s.substring(2, LENGTH));
        } else if (LENGTH >= 1 && s.charAt(0) == L) {
            return 50 + this.parseOne(s.substring(1, LENGTH));
        } else if (LENGTH >= 2 && s.charAt(0) == X && s.charAt(1) == L) {
            return 40 + this.parseOne(s.substring(2, LENGTH));
        } else if (LENGTH >= 3 && s.charAt(0) == X && s.charAt(1) == X && s.charAt(2) == X) {
            return 30 + this.parseOne(s.substring(3, LENGTH));
        } else if (LENGTH >= 2 && s.charAt(0) == X && s.charAt(1) == X) {
            return 20 + this.parseOne(s.substring(2, LENGTH));
        } else if (LENGTH >= 1 && s.charAt(0) == X) {
            return 10 + this.parseOne(s.substring(1, LENGTH));
        } else {
            return this.parseOne(s);
        }
    }

    private int parseOne(String s) {
        final byte LENGTH = (byte) s.length();
        if (LENGTH >= 2 && s.charAt(0) == I && s.charAt(1) == X) {
            return 9;
        } else if (LENGTH >= 4 && s.charAt(0) == V && s.charAt(1) == I && s.charAt(2) == I && s.charAt(3) == I) {
            return 8;
        } else if (LENGTH >= 3 && s.charAt(0) == V && s.charAt(1) == I && s.charAt(2) == I) {
            return 7;
        } else if (LENGTH >= 2 && s.charAt(0) == V && s.charAt(1) == I) {
            return 6;
        } else if (LENGTH >= 1 && s.charAt(0) == V) {
            return 5;
        } else if (LENGTH >= 2 && s.charAt(0) == I && s.charAt(1) == V) {
            return 4;
        } else if (LENGTH >= 3 && s.charAt(0) == I && s.charAt(1) == I && s.charAt(2) == I) {
            return 3;
        } else if (LENGTH >= 2 && s.charAt(0) == I && s.charAt(1) == I) {
            return 2;
        } else if (LENGTH >= 1 && s.charAt(0) == I) {
            return 1;
        } else {
            return 0;
        }
    }

    public int romanToInt(String s) {
        return this.parseThousand(s);
    }
}
