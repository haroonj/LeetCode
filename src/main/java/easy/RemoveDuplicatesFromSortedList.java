package easy;

import util.ListNode;

//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l0 = new ListNode(3);
        ListNode l1 = new ListNode(3, l0);
        ListNode l2 = new ListNode(2, l1);
        ListNode l3 = new ListNode(1, l2);
        ListNode l4 = new ListNode(1, l3);
        System.out.println(solution.deleteDuplicates(null));
    }

    static public class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if(head == null)
                return null;
            ListNode current = head;
            while (current.next != null) {
                if (current.val == current.next.val) {
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }
            return head;
        }
    }
}
