package com.fanwei.zeng;

// https://leetcode.com/problems/swap-nodes-in-pairs/
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = this.swapPairs(head.next);
        head.next = temp;
        return head;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(2, new ListNode(5, new ListNode(3, new ListNode(4, new ListNode(6, new ListNode(2, new ListNode(2)))))));
        SwapNodesInPairs solution = new SwapNodesInPairs();
        ListNode ret = solution.swapPairs(head);
        System.out.println(ret);
    }
}
