package io.zhtangsh.solutions;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * @author Created by Zihan Eric Tang(mrzihan.tang@gmail.com) on 2019/9/5
 * <p>
 * Concerns of INT_MAX and INT_MIN
 * INT_MAX=2147483647
 * INT_MIN=-2147483648
 */
public class Solution7 {

    public int reverse(int x) {
        int rev = 0, pop;
        while (x != 0) {
            pop = x % 10;
            x = x / 10;
            // Check whether rev*10 will overflow
            if (rev > Integer.MAX_VALUE / 10 || rev == Integer.MAX_VALUE / 10 && pop > 7) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || rev == Integer.MIN_VALUE / 10 && pop < -8) {
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
