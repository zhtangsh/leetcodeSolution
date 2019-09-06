package io.zhtangsh.solutions;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * Example
 * Input: [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 *
 * @author Created by Zihan Eric Tang(mrzihan.tang@gmail.com) on 2019/9/5
 */

/**
 * Idea: use dp to track maximum contiguous sum ending at each location of input array.
 * If we encounter negative sum, then reset sum to 0.
 */
public class Solution53 {
    public int maxSubArray(int[] nums) {
        int max = nums[0], dp, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum < 0) {
                dp = nums[i];
                sum = 0;
            } else {
                dp = sum;
            }
            max = Math.max(dp, max);
        }
        return max;
    }
}
