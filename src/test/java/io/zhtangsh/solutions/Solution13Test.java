package io.zhtangsh.solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Created by Zihan Eric Tang(mrzihan.tang@gmail.com) on 2019/9/5
 */
public class Solution13Test {

    @Test
    public void romanToInt() {
        Solution13 solution13 = new Solution13();
        assertEquals(3, solution13.romanToInt("III"));
        assertEquals(4, solution13.romanToInt("IV"));
        assertEquals(9, solution13.romanToInt("IX"));
        assertEquals(58, solution13.romanToInt("LVIII"));
        assertEquals(1994, solution13.romanToInt("MCMXCIV"));
    }
}