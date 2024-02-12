package medium;


import util.ListNode;

//https://leetcode.com/problems/add-two-numbers/
public class AddTwoNumbers {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode l0 = new ListNode(3);
        ListNode l1 = new ListNode(4, l0);
        ListNode l2 = new ListNode(2, l1);

        ListNode l10 = new ListNode(4);
        ListNode l11 = new ListNode(6, l10);
        ListNode l12 = new ListNode(5, l11);
        System.out.println(solution.addTwoNumbers(l2, l12));
    }

    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode head = new ListNode(0);
            ListNode l3 = head;
            int carry = 0;
            while (l1 != null || l2 != null) {
                int l1Val = (l1 != null) ? l1.val : 0;
                int l2Val = (l2 != null) ? l2.val : 0;

                int sum = l1Val + l2Val + carry;
                carry = sum / 10;

                l3.next = new ListNode(sum % 10);

                if (l1 != null) l1 = l1.next;
                if (l2 != null) l2 = l2.next;
                l3 = l3.next;
            }
            if (carry > 0) {
                l3.next = new ListNode(carry);
            }
            return head.next;
        }
    }


}

