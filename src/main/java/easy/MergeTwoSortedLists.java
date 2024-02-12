package easy;


import util.ListNode;

//https://leetcode.com/problems/merge-two-sorted-lists/
public class MergeTwoSortedLists {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode l0 = new ListNode(4);
        ListNode l1 = new ListNode(2, l0);
        ListNode l2 = new ListNode(1, l1);

        ListNode l10 = new ListNode(4);
        ListNode l11 = new ListNode(3, l10);
        ListNode l12 = new ListNode(1, l11);
        System.out.println(solution.mergeTwoLists(l2, l12));
    }

    static class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode node = new ListNode(0);
            ListNode mergedList = node;
            while (list1 != null || list2 != null) {
                int val1 = (list1 != null) ? list1.val : 101;
                int val2 = (list2 != null) ? list2.val : 101;
                if (val1 <= val2) {
                    node.next = list1;
                    list1 = list1.next;
                } else {
                    node.next = list2;
                    list2 = list2.next;
                }
                node = node.next;
            }

            return mergedList.next;
        }
    }
}
