package easy;

import util.ListNode;

//https://leetcode.com/problems/reverse-linked-list/
public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode l0 = new ListNode(5);
        ListNode l1 = new ListNode(4, l0);
        ListNode l2 = new ListNode(3, l1);
        ListNode l3 = new ListNode(2, l2);
        ListNode l4 = new ListNode(1, l3);

        Solution solution = new Solution();
        System.out.println(solution.reverseList(l4));
    }

    static class Solution {
        public ListNode reverseList(ListNode head) {
            if (head == null) return null;
            head = recursiveNode(head, null);
            return head;
        }
        private ListNode recursiveNode(ListNode current, ListNode previous) {
            if (current.next == null) {
                current.next = previous;
                return current;
            }
            ListNode head = recursiveNode(current.next, current);
            current.next = previous;
            return head;
        }
    }
}
