package com.fanwei.zeng;

// https://leetcode.com/problems/regular-expression-matching/
public class RegularExpressionMatching {
    private final char DOT = '.';
    private final char ASTERISK = '*';

    public boolean match(String s, String p) {
        // pattern of p: ., \w, .* or \w*
        final int S_LENGTH = s.length();
        final int P_LENGTH = p.length();

        if (P_LENGTH == 1) {
            if (p.charAt(0) == DOT) {
                if (S_LENGTH == 1) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return S_LENGTH == 1 && s.charAt(0) == p.charAt(0);
            }
        } else {
            // P_LENGTH = 2
            if (S_LENGTH == 0) {
                return true;
            } else {
                if (p.charAt(0) == DOT) {
                    return true;
                } else {
                    for (int i = 0; i < S_LENGTH; i++) {
                        if (s.charAt(i) != p.charAt(0)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
    }

    public boolean isMatch(String s, String p) {
        final int S_LENGTH = s.length();
        final int P_LENGTH = p.length();

        if (S_LENGTH == 0 && P_LENGTH != 0) {
            if (P_LENGTH == 1) {
                return false;
            } else {
                if (p.charAt(1) == ASTERISK) {
                    return this.isMatch("", p.substring(2, P_LENGTH));
                } else {
                    return false;
                }
            }
        }

        int i = 0;    // index of s
        int j = 0;    // index of p
        int k;        // ending repeating index of s
        while (i < S_LENGTH && j < P_LENGTH) {
            if (j + 1 < P_LENGTH && p.charAt(j + 1) == ASTERISK) {
                // find ending repeating index of s
                if (p.charAt(j) == DOT) {
                    // case: .*
                    for (k = i; k <= S_LENGTH; k++) {
                        if (this.isMatch(s.substring(k, S_LENGTH), p.substring(j + 2, P_LENGTH))) {
                            return true;
                        }
                    }
                    return false;
                } else {
                    // case: \w*
                    for (k = i + 1; k < S_LENGTH; k++) {
                        if (s.charAt(k) != s.charAt(i)) {
                            break;
                        }
                    }
                    if (this.match(s.substring(i, k), p.substring(j, j + 2))) {
                        for (int m = i; m <= k; m++) {
                            if (this.isMatch(s.substring(m, S_LENGTH), p.substring(j + 2, P_LENGTH))) {
                                return true;
                            }
                        }
                        i = k;
                        j += 2;
                    } else {
                        // omit \w*
                        return this.isMatch(s.substring(i, S_LENGTH), p.substring(j + 2, P_LENGTH));
                    }
                }
            } else {
                // ending of p reached
                if (!this.match(s.substring(i, i + 1), p.substring(j, j + 1))) {
                    return false;
                } else {
                    j++;
                    i++;
                }
            }
        }

        if (j < P_LENGTH) {
            return this.isMatch("", p.substring(j, P_LENGTH));
        } else {
            return i == S_LENGTH && j == P_LENGTH;
        }
    }
}
