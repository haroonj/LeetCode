package easy;

import java.util.Arrays;
//https://leetcode.com/problems/two-sum/
public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.twoSum(new int[]{3, 3}, 6)));
    }

    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if ((nums[i] + nums[j]) == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return null;
        }
    }
}
