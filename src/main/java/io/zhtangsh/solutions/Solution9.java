package io.zhtangsh.solutions;

/**
 * Determine whether an integer is a palindrome.
 * <p>
 * An integer is a palindrome when it reads the same backward as forward.
 * <p>
 * <p>
 * Idea:
 * org = rev
 *
 * @author Created by Zihan Eric Tang(mrzihan.tang@gmail.com) on 2019/9/5
 */
public class Solution9 {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int rev = 0, origin = x, pop;
        while (x > 0) {
            pop = x % 10;
            x = x / 10;
            rev = rev * 10 + pop;
        }
        return origin == rev;
    }
}
