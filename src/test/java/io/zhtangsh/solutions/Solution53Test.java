package io.zhtangsh.solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Created by Zihan Eric Tang(mrzihan.tang@gmail.com) on 2019/9/5
 */
public class Solution53Test {

    @Test
    public void maxSubarray() {
        int[] nums = new int[]{
                -2, 1, -3, 4, -1, 2, 1, -5, 4
        };
        Solution53 solution53 = new Solution53();
        assertEquals(6, solution53.maxSubArray(nums));
    }
}