package io.zhtangsh.solutions;

/**
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * <p>
 * Example 1:
 * <p>
 * Given nums = [3,2,2,3], val = 3,
 * 0 0
 * 0 1 -> 1 1 [2,3,2,3]([2,2,2,3])
 * 1 2 -> 2 2 [2,2,3,3]([2,2,2,3])
 * <p>
 * Your function should return length = 2, with the first two elements of nums being 2.
 * <p>
 * It doesn't matter what you leave beyond the returned length.
 * Example 2:
 * <p>
 * Given nums = [0,1,2,2,3,0,4,2], val = 2,
 * 0 0
 * 1 1
 * 2 2
 * 2 3
 * 2 4 -> 3 4 [0,1,3,2,2,0,4,2]
 * 3 5 -> 4 5 [0,1,3,0,2,2,4,2]
 * 4 6 -> 5 6 [0,1,3,0,4,2,2,2]
 * 5 7
 * Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.
 * <p>
 * Note that the order of those five elements can be arbitrary.
 * <p>
 * Two pointers
 * It doesn't matter what values are set beyond the returned length.
 *
 * @author Created by Zihan Eric Tang(mrzihan.tang@gmail.com) on 2019/9/6
 */
public class Solution27 {
    public int removeElement(int[] nums, int val) {
        int i = 0, j = 0;
        while (j < nums.length) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        return i;
    }
}
