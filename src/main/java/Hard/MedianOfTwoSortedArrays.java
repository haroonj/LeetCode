package Hard;

//https://leetcode.com/problems/median-of-two-sorted-arrays/
public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findMedianSortedArrays(new int[]{1, 4, 6}, new int[]{3, 5}));
    }

    static class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int m1 = 0, m2 = 0, index1 = 0, index2 = 0;
            boolean odd = (nums1.length + nums2.length) % 2 != 0;
            int divPoint = odd ? (nums1.length + nums2.length) / 2 + 1 : (nums1.length + nums2.length) / 2;
            for (int i = 0; i < divPoint; i++) {
                if (nums1[index1] < nums2[index2]) {
                    m1 = nums1[index1];
                    index1++;
                } else if (nums1[index1] >= nums2[index2]) {
                    m1 = nums2[index2];
                    index2++;
                }
            }
            return m1;
        }
    }
}
