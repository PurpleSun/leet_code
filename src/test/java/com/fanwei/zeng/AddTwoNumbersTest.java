package com.fanwei.zeng;

import org.junit.Test;


import static org.junit.Assert.*;

public class AddTwoNumbersTest {

    @Test
    public void addTwoNumbers() {
        ListNode nodeA0 = new ListNode(2);
        ListNode nodeA1 = new ListNode(4);
        ListNode nodeA2 = new ListNode(3);
        nodeA0.next = nodeA1;
        nodeA1.next = nodeA2;

        ListNode nodeB0 = new ListNode(5);
        ListNode nodeB1 = new ListNode(6);
        ListNode nodeB2 = new ListNode(4);
        nodeB0.next = nodeB1;
        nodeB1.next = nodeB2;

        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode ret = solution.addTwoNumbers(nodeA0, nodeB0);
        assertEquals(ret.val, 7);
        assertEquals(ret.next.val, 0);
        assertEquals(ret.next.next.val, 8);
    }
}