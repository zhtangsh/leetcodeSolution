package io.zhtangsh.solutions;

/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * Example 1:
 * <p>
 * Given nums = [1,1,2],
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 * <p>
 * It doesn't matter what you leave beyond the returned length.
 * Example 2:
 * <p>
 * Given nums = [0,0,1,1,1,2,2,3,3,4],
 * 0 0
 * 0 1
 * 0 2 -> 1 2 [0,1,0,1,1,2,2,3,3,4]
 * 1 3
 * 1 4
 * 1 5 -> 2 5 [0,1,2,1,1,0,2,3,3,4]
 * 2 6
 * 2 7 -> 3 7 [0,1,2,3,1,0,2,1,3,4]
 * 3 8
 * 3 9 -> 4 9 [0,1,2,3,4,0,2,1,3,1]
 * return 4
 * Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
 * <p>
 * It doesn't matter what values are set beyond the returned length.
 * <p>
 * two pointers
 *
 * @author Created by Zihan Eric Tang(mrzihan.tang@gmail.com) on 2019/9/6
 */
public class Solution26 {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 0;
        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i + 1;
    }
}
