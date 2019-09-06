package io.zhtangsh.solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Created by Zihan Eric Tang(mrzihan.tang@gmail.com) on 2019/9/6
 */
public class Solution38Test {

    @Test
    public void countAndSay() {
        Solution38 solution38 = new Solution38();
        assertEquals("1", solution38.countAndSay(1));
        assertEquals("11", solution38.countAndSay(2));
        assertEquals("21", solution38.countAndSay(3));
        assertEquals("1211", solution38.countAndSay(4));
        assertEquals("111221", solution38.countAndSay(5));
        assertEquals("312211", solution38.countAndSay(6));
    }
}