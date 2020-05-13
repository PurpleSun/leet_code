package com.fanwei.zeng;

// https://leetcode.com/problems/merge-two-sorted-lists/
public class MergeLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode left = l1;
        ListNode right = l2;
        ListNode newHeader = null;
        ListNode pointer = null;
        while (left != null && right != null) {
            ListNode ListNode;
            if (left.val < right.val) {
                ListNode = new ListNode(left.val);
                left = left.next;
            } else {
                ListNode = new ListNode(right.val);
                right = right.next;
            }
            if (newHeader == null) {
                newHeader = ListNode;
                pointer = ListNode;
            } else {
                pointer.next = ListNode;
                pointer = pointer.next;
            }
        }

        for (ListNode node : new ListNode[]{left, right}) {
            while (node != null) {
                ListNode ListNode = new ListNode(node.val);
                if (newHeader == null) {
                    newHeader = ListNode;
                    pointer = ListNode;
                } else {
                    pointer.next = ListNode;
                    pointer = pointer.next;
                }
                node = node.next;
            }
        }

        return newHeader;
    }
}
