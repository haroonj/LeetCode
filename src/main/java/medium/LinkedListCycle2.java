package medium;

import util.ListNode;

import java.util.HashSet;

//https://leetcode.com/problems/linked-list-cycle-ii/
public class LinkedListCycle2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l0 = new ListNode(-4);
        ListNode l1 = new ListNode(0, l0);
        ListNode l2 = new ListNode(2, l1);
        l0.next = l2;
        ListNode l3 = new ListNode(3, l2);
        System.out.println(solution.detectCycle(l3).val);

    }

    static public class Solution {
        public ListNode detectCycle(ListNode head) {
            HashSet<ListNode> hs = new HashSet<>();
            while (head != null) {
                if (hs.contains(head.next)) return head.next;
                else hs.add(head);

                head = head.next;
            }
            return null;
        }
    }
}
