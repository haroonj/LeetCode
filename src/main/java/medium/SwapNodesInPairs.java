package medium;

import util.ListNode;
//https://leetcode.com/problems/swap-nodes-in-pairs/
public class SwapNodesInPairs {
    public static void main(String[] args){

    }
    static class Solution {
        public ListNode swapPairs(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }

            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode curr = dummy;

            while (curr.next != null && curr.next.next != null) {
                ListNode first = curr.next;
                ListNode second = curr.next.next;

                first.next = second.next;
                curr.next = second;
                curr.next.next = first;

                curr = curr.next.next;
            }

            return dummy.next;
        }
    }
}
