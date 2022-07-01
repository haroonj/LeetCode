package Medium;

import java.math.BigInteger;

//https://leetcode.com/problems/add-two-numbers/
public class AddTwoNumbers {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode l0 = new ListNode(9);

        ListNode l10 = new ListNode(9);
        ListNode l11 = new ListNode(9, l10);
        ListNode l12 = new ListNode(9, l11);
        ListNode l13 = new ListNode(9, l12);
        ListNode l14 = new ListNode(9, l13);
        ListNode l15 = new ListNode(9, l14);
        ListNode l16 = new ListNode(9, l15);
        ListNode l17 = new ListNode(9, l16);
        ListNode l18 = new ListNode(9, l17);
        ListNode l19 = new ListNode(1, l18);
        System.out.println(solution.addTwoNumbers(l0, l19));
    }

    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            BigInteger val1 = toLong(l1);
            BigInteger val2 = toLong(l2);
            BigInteger sum = val1.add(val2);
            if (sum.equals(BigInteger.valueOf(0))) {
                return new ListNode(0);
            }
            ListNode listNode = fromLong(sum);
            sum = toLong(listNode);
            return fromLong(sum);
        }

        public BigInteger toLong(ListNode listNode) {
            BigInteger x = BigInteger.valueOf(0);
            long rank = 1;
            while (listNode != null) {
                x = x.add(BigInteger.valueOf(listNode.val * rank));
                listNode = listNode.next;
                rank *= 10;
            }
            return x;
        }

        public ListNode fromLong(BigInteger value) {
            ListNode listNode = null;
            String val = value.toString();
            System.out.println(val);
            for (int i = 0; i < val.length(); i++) {
                listNode = new ListNode(Integer.parseInt(String.valueOf(val.charAt(i))), listNode);
            }
            return listNode;
        }
    }
}

