package io.zhtangsh.solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Created by Zihan Eric Tang(mrzihan.tang@gmail.com) on 2019/9/6
 */
public class Solution26Test {

    @Test
    public void removeDuplicates() {
        Solution26 solution26 = new Solution26();
        assertEquals(2, solution26.removeDuplicates(new int[]{1, 1, 2}));
        assertEquals(5, solution26.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }
}