package medium;

//https://leetcode.com/problems/arithmetic-slices/
public class ArithmeticSlices {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numberOfArithmeticSlices(new int[]{1}));
    }

    static class Solution {
        public int numberOfArithmeticSlices(int[] nums) {
            int n = nums.length;
            int count = 0;
            int dp = 0;

            for (int i = 2; i < n; i++) {
                if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                    dp++;
                    count += dp;
                } else {
                    dp = 0;
                }
            }

            return count;
        }
    }
}
