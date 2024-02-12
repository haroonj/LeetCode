package easy;

import util.ListNode;
//https://leetcode.com/problems/linked-list-cycle/
public class LinkedListCycle {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l0 = new ListNode(-4);
        ListNode l1 = new ListNode(0, l0);
        ListNode l2 = new ListNode(2, l1);
        l0.next = l2;
        ListNode l3 = new ListNode(3, l2);
        System.out.println(solution.hasCycle(l3));
    }

    static class Solution {
        public boolean hasCycle(ListNode head) {
            if (head == null) return false;
            ListNode slow = head;
            ListNode fast = head.next;
            while (fast != slow) {
                if (fast == null || fast.next == null) return false;
                slow = slow.next;
                fast = fast.next.next;
            }
            return true;
        }
    }
}
