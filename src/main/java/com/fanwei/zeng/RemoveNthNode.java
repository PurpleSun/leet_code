package com.fanwei.zeng;

import java.util.ArrayList;
import java.util.List;

class Node {
    int val;
    Node next;

    Node() {
    }

    Node(int val) {
        this.val = val;
    }

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class RemoveNthNode {
    public Node removeNthFromEnd(Node head, int n) {
        List<Node> nodes = new ArrayList<>();
        Node point = head;
        while (point != null) {
            nodes.add(point);
            point = point.next;
        }
        if (n == nodes.size()) {
            // 删除第一个
            Node newHead = head.next;
            head.next = null;
            return newHead;
        } else if (n == 1) {
            // 删除最后一个
            int index = nodes.size() - n;
            nodes.get(index - 1).next = null;
            return head;
        } else {
            // 中间段
            int index = nodes.size() - n;
            nodes.get(index - 1).next = nodes.get(index + 1);
            nodes.get(index).next = null;
            return head;
        }
    }
}
