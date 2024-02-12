package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/3sum/
public class ThreeSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    static class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            int n = nums.length;
            Arrays.sort(nums);
            List<List<Integer>> list = new ArrayList<>();
            for (int i = 0; i < n - 2; i++) {
                if (i == 0 || nums[i] != nums[i - 1]) {
                    int j = i + 1;
                    int k = n - 1;
                    int sum = -nums[i];
                    while (j < k) {
                        if (nums[j] + nums[k] == sum) {
                            List<Integer> temp = new ArrayList<>();
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[k]);
                            list.add(temp);
                            while (j < k && nums[j] == nums[j + 1]) j++;
                            while (j < k && nums[k] == nums[k - 1]) k--;
                            j++;
                            k--;
                        } else if (nums[j] + nums[k] > sum) {
                            k--;
                        } else {
                            j++;
                        }
                    }
                }
            }

            return list;
        }
    }
}
