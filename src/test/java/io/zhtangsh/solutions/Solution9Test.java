package io.zhtangsh.solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Created by Zihan Eric Tang(mrzihan.tang@gmail.com) on 2019/9/5
 */
public class Solution9Test {

    @Test
    public void isPalindrome() {
        Solution9 solution9 = new Solution9();
        assertEquals(true, solution9.isPalindrome(0));
        assertEquals(false, solution9.isPalindrome(-121));
        assertEquals(true, solution9.isPalindrome(121));
        assertEquals(false, solution9.isPalindrome(10));
    }
}