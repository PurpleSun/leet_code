package com.fanwei.zeng;

// https://leetcode.com/problems/zigzag-conversion/
public class ZigZagConversion {
    private final static boolean DIRECTION_DOWN = true;
    private final static boolean DIRECTION_UP = false;

    public char[][] stringToArray2D(String s, int numRows) {
        final int LENGTH = s.length();
        final int LOOP_SIZE = numRows + numRows - 2;
        int columns = (LENGTH / LOOP_SIZE) * (numRows - 1);
        final int remainder = LENGTH % LOOP_SIZE;
        if (0 == remainder) {
        } else if (remainder <= numRows) {
            columns++;
        } else {
            columns += (remainder - numRows + 1);
        }

        char[][] array2D = new char[numRows][columns];
        int x = 0;
        int y = 0;
        boolean direction = DIRECTION_DOWN;
        int loopRemainder;
        for (int i = 0; i < LENGTH; i++) {
            array2D[x][y] = s.charAt(i);
            if (direction == DIRECTION_DOWN) {
                x++;
                if (x == numRows - 1) {
                    direction = DIRECTION_UP;
                }
            } else {
                x--;
                if (x == 0) {
                    direction = DIRECTION_DOWN;
                }
            }

            loopRemainder = i % LOOP_SIZE;
            if (loopRemainder >= (numRows - 1)) {
                y++;
            }
        }

        return array2D;
    }

    private String array2DToString(char[][] array2D, int capacity) {
        StringBuilder sb = new StringBuilder(capacity);
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if (array2D[i][j] != 0) {
                    sb.append(array2D[i][j]);
                }
            }
        }
        return sb.toString();
    }

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        char[][] array2D = this.stringToArray2D(s, numRows);
        return this.array2DToString(array2D, s.length());
    }

    private void printArray2D(char[][] array2D) {
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.printf("%c ", array2D[i][j]);
            }
            System.out.println();
        }
    }
}
