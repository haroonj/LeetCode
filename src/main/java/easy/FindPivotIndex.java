package easy;

//https://leetcode.com/problems/find-pivot-index/
public class FindPivotIndex {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.pivotIndex(new int[]{-1, -1, 0, -1, -1, 0}));
    }

    static class Solution {
        public int pivotIndex(int[] nums) {
            int rightSum = 0, leftSum = 0;
            for (int num : nums) rightSum += num;

            for (int i = 0; i < nums.length; i++) {
                rightSum -= nums[i];
                if (rightSum == leftSum) return i;
                leftSum += nums[i];
            }
            return -1;
        }
    }
}
