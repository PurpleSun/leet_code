package com.fanwei.zeng;

import java.util.Stack;

// https://leetcode.com/problems/reverse-nodes-in-k-group/
public class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode pointerIn = head;
        Stack<ListNode> stack = new Stack<>();
        int n = 0;
        while (pointerIn != null && n < k) {
            stack.push(pointerIn);
            pointerIn = pointerIn.next;
            n++;
        }

        if (pointerIn == null && n < k) {
            return head;
        }

        ListNode node = new ListNode(0);
        ListNode pointerOut = node;
        while (!stack.empty()) {
            pointerOut.next = stack.pop();
            pointerOut = pointerOut.next;
        }
        pointerOut.next = reverseKGroup(pointerIn, k);
        return node.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ReverseKGroup solution = new ReverseKGroup();
        ListNode ret = solution.reverseKGroup(head, 3);
        System.out.println(ret);
    }
}
