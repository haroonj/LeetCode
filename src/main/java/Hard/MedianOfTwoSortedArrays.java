package Hard;

//https://leetcode.com/problems/median-of-two-sorted-arrays/
public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findMedianSortedArrays(new int[]{40, 43, 46, 49}, new int[]{46, 48, 49, 50}));
    }

    static class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int m1 = 0, index1 = 0, index2 = 0;
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
            if (!odd) {
                int m2;
                int t1 = 1000001, t2 = 1000001;
                if (index1 < nums1.length) t1 = nums1[index1];
                if (index2 < nums2.length) t2 = nums2[index2];
                m2 = Math.min(t1, t2);
                return (double) (m1 + m2) / 2;
            }
            return m1;
        }
    }
}
//                    if (!odd && i + 1 == divPoint) {
//                            if (index1 != nums1.length)
//                            m2 = nums1[index1];
//                            else
//                            m2 = nums2[index2];
//                            }