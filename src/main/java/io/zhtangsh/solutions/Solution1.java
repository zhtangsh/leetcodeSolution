package io.zhtangsh.solutions;

import java.util.*;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * @author Created by Zihan Eric Tang(mrzihan.tang@gmail.com) on 2019/9/5
 */
public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        final Map<Integer, Integer> record = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (record.containsKey(target - nums[i])) {
                return new int[]{record.get(target - nums[i]), i};
            }
            record.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
