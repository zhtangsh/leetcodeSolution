package io.zhtangsh.solutions;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * <p>
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * <p>
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * <p>
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * <p>
 * Idea:
 * On leetcode, O(2n) submission does not have significant difference between O(n) submission
 * @author Created by Zihan Eric Tang(mrzihan.tang@gmail.com) on 2019/9/5
 */
public class Solution3 {
    /**
     * Use sliding window to check maximum substring at each location
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring_basic(String s) {
        char[] chars = s.toCharArray();
        int[] record = new int[256];
        int i = 0, j = 0, max = 0;
        while (i < chars.length && j < chars.length) {
            if (record[chars[j]] > 0) {
                record[chars[i]]--;
                i++;
            } else {
                record[chars[j]]++;
                j++;
                max = Math.max(max, j - i);
            }
        }
        return max;
    }

    /**
     * Based on the basic solution, suppose current window is [i,j), and s[j] == s[k] where i<=k<j, then we could skip
     * all elements between [i,k).
     * Suppose we have point n in [i,k), then maximum substring without repeated chars should be [n,j) since s[j] == s[k]
     * and substring(n,j) is shorter than substring(i,j)
     * Thus we could skip all points between [i,k]
     * <p>
     * In this version, we use record as a tracker of index for each occurrence
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int[] record = new int[256];
        int i = 0, j = 0, max = 0;
        while (i < chars.length && j < chars.length) {
            i = Math.max(record[chars[j]], i);
            max = Math.max(max, j - i + 1);
            record[chars[j]] = j + 1; // for s[j], index start from j + 1
            j++;
        }
        return max;
    }
}
