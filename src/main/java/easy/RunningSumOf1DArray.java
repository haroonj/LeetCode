package easy;

import java.util.Arrays;

//https://leetcode.com/problems/running-sum-of-1d-array/
public class RunningSumOf1DArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.runningSum(new int[]{3, 1, 2, 10, 1})));
    }

    static class Solution {
        public int[] runningSum(int[] nums) {
            int[] sums = new int[nums.length];
            int prevSum = 0;
            for (int i = 0; i < nums.length; i++) {
                prevSum = nums[i] + prevSum;
                sums[i] = prevSum;
            }
            return sums;
        }
    }
}
