package com.fanwei.zeng;



// https://leetcode.com/problems/merge-k-sorted-lists/
public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode newHeader = null;
        ListNode pointer = null;
        int index;
        while ((index = this.findMinIndex(lists)) != -1) {
            int val = lists[index].val;
            ListNode listNode = new ListNode(val);
            if (newHeader == null) {
                newHeader = listNode;
                pointer = newHeader;
            } else {
                pointer.next = listNode;
                pointer = pointer.next;
            }

            // 删除头节点
            ListNode temp = lists[index].next;
            lists[index].next = null;
            lists[index] = temp;
        }
        return newHeader;
    }

    public int findMinIndex(ListNode[] lists) {
        int minIndex = -1;
        ListNode minNode = null;
        for (int i = 0; i < lists.length; i++) {
            if (minNode == null) {
                if (lists[i] != null) {
                    minNode = lists[i];
                    minIndex = i;
                }
            } else {
                if (lists[i] != null && lists[i].val < minNode.val) {
                    minNode = lists[i];
                    minIndex = i;
                }
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        // [[1,4,5],[1,3,4],[2,6]]
        ListNode[] lists = new ListNode[]{
                new ListNode(1, new ListNode(4, new ListNode(5))),
                new ListNode(1, new ListNode(3, new ListNode(4))),
                new ListNode(2, new ListNode(6)),
        };
        MergeKSortedLists solution = new MergeKSortedLists();
        ListNode res = solution.mergeKLists(lists);
        System.out.println(res);
    }
}
