package io.zhtangsh.solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Created by Zihan Eric Tang(mrzihan.tang@gmail.com) on 2019/9/6
 */
public class Solution35Test {

    @Test
    public void searchInsert() {
        Solution35 solution35 = new Solution35();
        assertEquals(2, solution35.searchInsert(new int[]{1, 3, 5, 6}, 5));
        assertEquals(1, solution35.searchInsert(new int[]{1, 3, 5, 6}, 2));
        assertEquals(4, solution35.searchInsert(new int[]{1, 3, 5, 6}, 7));
        assertEquals(0, solution35.searchInsert(new int[]{1, 3, 5, 6}, 0));
    }
}