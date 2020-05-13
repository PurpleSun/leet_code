package com.fanwei.zeng;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class LetterCombinations {
    private final static Map<Character, List<String>> PHONE_MAP = new HashMap<Character, List<String>>() {{
        this.put('2', new ArrayList<String>(3) {{
            this.add("a");
            this.add("b");
            this.add("c");
        }});
        this.put('3', new ArrayList<String>(3) {{
            this.add("d");
            this.add("e");
            this.add("f");
        }});
        this.put('4', new ArrayList<String>(3) {{
            this.add("g");
            this.add("h");
            this.add("i");
        }});
        this.put('5', new ArrayList<String>(3) {{
            this.add("j");
            this.add("k");
            this.add("l");
        }});
        this.put('6', new ArrayList<String>(3) {{
            this.add("m");
            this.add("n");
            this.add("o");
        }});
        this.put('7', new ArrayList<String>(4) {{
            this.add("p");
            this.add("q");
            this.add("r");
            this.add("s");
        }});
        this.put('8', new ArrayList<String>(3) {{
            this.add("t");
            this.add("u");
            this.add("v");
        }});
        this.put('9', new ArrayList<String>(4) {{
            this.add("w");
            this.add("x");
            this.add("y");
            this.add("z");
        }});
    }};

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < digits.length(); i++) {
            if (i == 0) {
                res = PHONE_MAP.get(digits.charAt(i));
            } else {
                List<String> xList = res;
                List<String> yList = PHONE_MAP.get(digits.charAt(i));
                if (yList == null) {
                    continue;
                }
                int size = xList.size() * yList.size();
                List<String> temp = new ArrayList<>(size);
                for (String xStr : xList) {
                    for (String yStr : yList) {
                        sb.append(xStr).append(yStr);
                        temp.add(sb.toString());
                        sb.delete(0, sb.length());
                    }
                }
                res = temp;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LetterCombinations solution = new LetterCombinations();
        List<String> res = solution.letterCombinations("23");
        System.out.println(res);
    }
}
