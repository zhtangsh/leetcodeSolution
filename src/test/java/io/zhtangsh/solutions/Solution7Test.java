package io.zhtangsh.solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Created by Zihan Eric Tang(mrzihan.tang@gmail.com) on 2019/9/5
 */
public class Solution7Test {

    @Test
    public void test1() {
        Solution7 solution7 = new Solution7();
        assertEquals(11, solution7.reverse(110));
        assertEquals(-1432, solution7.reverse(-2341));
    }
}