package io.zhtangsh.solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Created by Zihan Eric Tang(mrzihan.tang@gmail.com) on 2019/9/6
 */
public class Solution14Test {

    @Test
    public void test1() {
        Solution14 solution14 = new Solution14();
        assertEquals("fl", solution14.longestCommonPrefixHorizontal(new String[]{"flower", "flow", "flight"}));
        assertEquals("", solution14.longestCommonPrefixHorizontal(new String[]{"dog", "racecar", "car"}));
        assertEquals("a", solution14.longestCommonPrefixHorizontal(new String[]{"aa", "a", "aaa"}));
    }

    @Test
    public void test2() {
        Solution14 solution14 = new Solution14();
        assertEquals("fl", solution14.longestCommonPrefixVertical(new String[]{"flower", "flow", "flight"}));
        assertEquals("", solution14.longestCommonPrefixVertical(new String[]{"dog", "racecar", "car"}));
        assertEquals("a", solution14.longestCommonPrefixVertical(new String[]{"aa", "a", "aaa"}));
        assertEquals("aa", solution14.longestCommonPrefixVertical(new String[]{"aa", "aaaa", "aaa"}));

    }

    @Test
    public void test3() {
        Solution14 solution14 = new Solution14();
        assertEquals("fl", solution14.longestCommonPrefixDandC(new String[]{"flower", "flow", "flight"}));
        assertEquals("", solution14.longestCommonPrefixDandC(new String[]{"dog", "racecar", "car"}));
        assertEquals("a", solution14.longestCommonPrefixDandC(new String[]{"aa", "a", "aaa"}));
        assertEquals("aa", solution14.longestCommonPrefixDandC(new String[]{"aa", "aaaa", "aaa"}));

    }
}