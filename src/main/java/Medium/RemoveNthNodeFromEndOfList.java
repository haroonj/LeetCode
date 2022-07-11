package Medium;

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
            ListNode temp = head;
            int count = 0;
            while (temp != null) {
                temp = temp.next;
                count++;
            }
            System.out.println(count);
            return head;
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}


