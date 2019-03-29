package com.fanwei.zeng;


import java.math.BigDecimal;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

// https://leetcode.com/problems/add-two-numbers/
public class AddTwoNumbers {
    private static BigDecimal DECIMAL_10 = new BigDecimal(10);

    private BigDecimal list2Num(ListNode l) {
        ListNode head = l;
        BigDecimal num = new BigDecimal(0);
        int base = 0;
        BigDecimal multiple;
        while (true) {
            base += 1;
            multiple = DECIMAL_10.pow(base - 1);
            num = num.add(new BigDecimal(head.val).multiply(multiple));
            head = head.next;
            if (head == null) {
                break;
            }
        }
        return num;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigDecimal DECIMAL_0 = new BigDecimal(0);
        BigDecimal num1 = this.list2Num(l1);
        BigDecimal num2 = this.list2Num(l2);
        BigDecimal num = num1.add(num2);
        BigDecimal quotient;
        BigDecimal remainder;
        ListNode head = null;
        ListNode last = null;
        ListNode current;
        while (true) {
            BigDecimal[] result = num.divideAndRemainder(DECIMAL_10);
            quotient = result[0];
            remainder = result[1];
            current = new ListNode(remainder.intValue());
            if (last != null) {
                last.next = current;
                last = current;
            } else {
                if (head == null) {
                    head = current;
                }
                last = current;
            }
            num = quotient;
            if (num.equals(DECIMAL_0)) {
                break;
            }
        }

        return head;
    }
}
