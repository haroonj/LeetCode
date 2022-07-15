package Easy;

import util.ListNode;

//https://leetcode.com/problems/middle-of-the-linked-list/
public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.middleNode(new ListNode(0)));
    }

    static class Solution {
        public ListNode middleNode(ListNode head) {
            return head;
        }
    }
}
