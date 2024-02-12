package easy;

import java.util.Arrays;

//https://leetcode.com/problems/merge-sorted-array/description/
public class MergeSortedArray {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        solution.merge(nums1, nums1.length - nums2.length, nums2, nums2.length);
        System.out.println(Arrays.toString(nums1));
    }

    static class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int p = m + n - 1;
            int p1 = m - 1;
            int p2 = n - 1;

            while (p1 >= 0 && p2 >= 0) {
                if (nums1[p1] > nums2[p2]) {
                    nums1[p] = nums1[p1];
                    p1--;
                } else {
                    nums1[p] = nums2[p2];
                    p2--;
                }
                p--;
            }
            while (p2 >= 0) {
                nums1[p] = nums2[p2];
                p--;
                p2--;
            }
        }
    }
}
