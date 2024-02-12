package medium;

import util.ListNode;

//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l0 = new ListNode(5);
        ListNode l1 = new ListNode(4, l0);
        ListNode l2 = new ListNode(3, l1);
        ListNode l3 = new ListNode(2, l2);
        ListNode l4 = new ListNode(1, l3);
        System.out.println(solution.removeNthFromEnd(l4, 2));
    }

    static class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;

            ListNode fast = dummy;
            ListNode slow = dummy;

            for (int i = 0; i <= n; i++) {
                fast = fast.next;
            }

            while (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }

            slow.next = slow.next.next;

            return dummy.next;
        }
    }

}


