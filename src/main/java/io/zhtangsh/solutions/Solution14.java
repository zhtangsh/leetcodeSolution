package io.zhtangsh.solutions;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * Example 1:
 * <p>
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * <p>
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * Note:
 * <p>
 * All given inputs are in lowercase letters a-z.
 *
 * @author Created by Zihan Eric Tang(mrzihan.tang@gmail.com) on 2019/9/6
 */
public class Solution14 {
    /**
     * Scan horizontal, i.e
     * lcp(s1,s2,s3) = lcp(lcp(s1,s2),s3) etc...
     *
     * @param strs
     * @return
     */
    public String longestCommonPrefixHorizontal(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (String str : strs) {
            prefix = this.commonPrefix(prefix, str);
            if (prefix.length() == 0) {
                break;
            }
        }
        return prefix;
    }

    private String commonPrefix(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() == 0 || str2.length() == 0) {
            return "";
        }
        int min = Math.min(str1.length(), str2.length());
        for (int i = 0; i < min; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.substring(0, i);
            }
        }
        return str1.substring(0, min);
    }

    public String longestCommonPrefixVertical(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (i == strs[j].length() || c != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

    public String longestCommonPrefixDandC(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        return this.longestCommonPrefix(strs, 0, strs.length - 1);
    }

    // strs = [0,1,2,3] length = 4  l = 0, r =3
    // mid = 1 [0,1] [2,3]
    // strs = [0,1,2,3,4] length =5 l=0, r=4
    // mid = 2 [0,1,2] [3,4]
    public String longestCommonPrefix(String[] strs, int l, int r) {
        if (l == r) {
            return strs[l];
        } else {
            int mid = (l + r) / 2;
            String leftString = this.longestCommonPrefix(strs, l, mid);
            String rightString = this.longestCommonPrefix(strs, mid + 1, r);
            return this.commonPrefix(leftString, rightString);
        }
    }
}
