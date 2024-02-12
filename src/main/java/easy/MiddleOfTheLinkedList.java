package easy;

import util.ListNode;

//https://leetcode.com/problems/middle-of-the-linked-list/
public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode lh = new ListNode(6);
        ListNode l0 = new ListNode(5, lh);
        ListNode l1 = new ListNode(4, l0);
        ListNode l2 = new ListNode(3, l1);
        ListNode l3 = new ListNode(2, l2);
        ListNode l4 = new ListNode(1, l3);
        System.out.println(solution.middleNode(l4));
    }

    static class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode dummyHead = new ListNode(0);
            int numOfNodes = 0;
            dummyHead.next = head;
            while (dummyHead.next != null) {
                numOfNodes++;
                dummyHead = dummyHead.next;
            }
            for (int i = 0; i < numOfNodes / 2; i++) {
                head = head.next;
            }
            return head;
        }
    }
}
