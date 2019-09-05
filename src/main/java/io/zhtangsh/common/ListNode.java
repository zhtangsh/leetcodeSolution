package io.zhtangsh.common;

/**
 * @author Created by Zihan Eric Tang(mrzihan.tang@gmail.com) on 2019/9/5
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode cur = this;
        while (cur.next != null) {
            sb.append(cur.val);
            sb.append("->");
            cur = cur.next;
        }
        sb.append(cur.val);
        return sb.toString();
    }
}