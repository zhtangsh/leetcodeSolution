package io.zhtangsh.solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Created by Zihan Eric Tang(mrzihan.tang@gmail.com) on 2019/9/6
 */
public class Solution58Test {

    @Test
    public void lengthOfLastWord() {
        Solution58 solution58 = new Solution58();
        assertEquals(5, solution58.lengthOfLastWord("Hello World"));
        assertEquals(5, solution58.lengthOfLastWord("Hello World     "));

    }
}