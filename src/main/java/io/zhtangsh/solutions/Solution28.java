package io.zhtangsh.solutions;

/**
 * Implement strStr().
 * <p>
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * <p>
 * Example 1:
 * <p>
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 * <p>
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * h = 5 n = 3
 * i <= 2
 * (i,j,k)
 *
 * @author Created by Zihan Eric Tang(mrzihan.tang@gmail.com) on 2019/9/6
 */
public class Solution28 {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        int h = haystack.length(), n = needle.length();
        if (h < n) {
            return -1;
        }
        int i = 0;
        while (i < h - n + 1) {
            if (haystack.charAt(i) == needle.charAt(0) && this.compare(haystack, needle, i)) {
                return i;
            }
            i++;
        }
        return -1;

    }

    private boolean compare(String haystack, String needle, int index) {
        for (int i = needle.length() - 1; i >= 0; i--) {
            if (haystack.charAt(index + i) != needle.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
