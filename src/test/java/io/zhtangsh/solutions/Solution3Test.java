package io.zhtangsh.solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Created by Zihan Eric Tang(mrzihan.tang@gmail.com) on 2019/9/5
 */
public class Solution3Test {

    @Test
    public void test1() {
        Solution3 solution3 = new Solution3();
        String s = "bbbbb";
        assertEquals(1, solution3.lengthOfLongestSubstring_basic(s));
        assertEquals(1, solution3.lengthOfLongestSubstring(s));
    }

    @Test
    public void test2() {
        Solution3 solution3 = new Solution3();
        String s = "abcabcbb";
        assertEquals(3, solution3.lengthOfLongestSubstring_basic(s));
        assertEquals(3, solution3.lengthOfLongestSubstring(s));


    }

    @Test
    public void test3() {
        Solution3 solution3 = new Solution3();
        String s = "pwwkew";
        assertEquals(3, solution3.lengthOfLongestSubstring_basic(s));
        assertEquals(3, solution3.lengthOfLongestSubstring(s));


    }
}