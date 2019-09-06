package io.zhtangsh.solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Created by Zihan Eric Tang(mrzihan.tang@gmail.com) on 2019/9/6
 */
public class Solution28Test {

    @Test
    public void strStr() {
        Solution28 solution28 = new Solution28();
        assertEquals(2, solution28.strStr("hello", "ll"));
        assertEquals(-1, solution28.strStr("aaaaa", "bba"));
        assertEquals(0, solution28.strStr("aaaaa", ""));
    }
}