package io.zhtangsh.solutions;

import io.zhtangsh.common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Created by Zihan Eric Tang(mrzihan.tang@gmail.com) on 2019/9/5
 */
public class Solution2Test {

    @Test
    public void test1() {
        Solution2 solution2 = new Solution2();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        System.out.println(l1);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        System.out.println(l2);
        ListNode result = solution2.addTwoNumbers(l1, l2);
        System.out.println(result);
    }

    @Test
    public void test2() {
        Solution2 solution2 = new Solution2();
        ListNode l1 = new ListNode(5);
        System.out.println(l1);
        ListNode l2 = new ListNode(6);
        System.out.println(l2);
        ListNode result = solution2.addTwoNumbers(l1, l2);
        System.out.println(result);
    }
}