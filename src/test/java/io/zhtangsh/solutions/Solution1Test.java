package io.zhtangsh.solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Created by Zihan Eric Tang(mrzihan.tang@gmail.com) on 2019/9/5
 */
public class Solution1Test {

    @Test
    public void test1() {
        Solution1 solution1 = new Solution1();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        assertArrayEquals(new int[]{0, 1}, solution1.twoSum(nums, target));
    }

    @Test
    public void test2() {
        Solution1 solution1 = new Solution1();
        int[] nums = new int[]{3, 2, 4, 7, 11, 15};
        int target = 6;
        assertArrayEquals(new int[]{1, 2}, solution1.twoSum(nums, target));
    }
}