package io.zhtangsh.solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Created by Zihan Eric Tang(mrzihan.tang@gmail.com) on 2019/9/6
 */
public class Solution27Test {

    @Test
    public void removeElement() {
        Solution27 solution27 = new Solution27();
        int[] d1 = new int[]{3, 2, 2, 3};
        assertEquals(2, solution27.removeElement(d1, 3));
        int[] d2 = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        assertEquals(5, solution27.removeElement(d2, 2));
    }
}