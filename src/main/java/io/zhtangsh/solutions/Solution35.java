package io.zhtangsh.solutions;

/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * <p>
 * You may assume no duplicates in the array.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,3,5,6], 5
 * Output: 2
 * Example 2:
 * <p>
 * Input: [1,3,5,6], 2
 * Output: 1
 * Example 3:
 * <p>
 * Input: [1,3,5,6], 7
 * Output: 4
 * Example 4:
 * <p>
 * Input: [1,3,5,6], 0
 * Output: 0
 * <p>
 * binary search
 *
 * @author Created by Zihan Eric Tang(mrzihan.tang@gmail.com) on 2019/9/6
 */
public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        return this.binarySearch(nums, target, 0, nums.length - 1);
    }

    public int binarySearch(int[] nums, int target, int l, int r) {
        if (target < nums[l]) {
            return l;
        }
        if (target > nums[r]) {
            return r + 1;
        }
        int mid = l + (r - l) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        if (target < nums[mid]) {
            return binarySearch(nums, target, l, mid);
        } else {
            return binarySearch(nums, target, mid + 1, r);
        }
    }
}
