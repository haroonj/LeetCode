package hard;


import util.ListNode;

//https://leetcode.com/problems/merge-k-sorted-lists/
public class MergeKSortedLists {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mergeKLists(new ListNode[]{}));
    }

    static class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            if(lists.length == 0)
                return null;
            int interval = 1;
            while(interval < lists.length){
                for (int i = 0; i + interval < lists.length; i = i + interval*2){
                    lists[i] = mergeTwoLists(lists[i], lists[i+interval]);
                }
                interval *= 2;
            }

            return lists[0];
        }

        private ListNode mergeTwoLists(ListNode l1, ListNode l2){
            if(l1 == null)
                return l2;
            if (l2 == null)
                return l1;
            if(l1.val < l2.val){
                l1.next = mergeTwoLists(l1.next, l2);
                return l1;
            }else {
                l2.next = mergeTwoLists(l1, l2.next);
                return l2;
            }
        }
    }
}
