package io.zhtangsh.solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Created by Zihan Eric Tang(mrzihan.tang@gmail.com) on 2019/9/6
 */
public class Solution20Test {

    @Test
    public void isValid() {
        Solution20 solution20 = new Solution20();
        assertEquals(true, solution20.isValid("()"));
        assertEquals(true, solution20.isValid("()[]{}"));
        assertEquals(false, solution20.isValid("(]"));
        assertEquals(false, solution20.isValid("([)]"));
        assertEquals(false, solution20.isValid("]"));
        assertEquals(false, solution20.isValid("["));
        assertEquals(true, solution20.isValid("{[]}"));
    }
}