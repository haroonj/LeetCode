package Easy;

import util.ListNode;

//https://leetcode.com/problems/reverse-linked-list/
public class ReverseLinkedList {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseList(new ListNode()));
    }

    static class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode dummyHead = new ListNode(0);
            return dummyHead.next;
        }
    }
}
