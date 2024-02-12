package easy;

//https://leetcode.com/problems/remove-element/
public class RemoveElement {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(solution.removeElement(nums, 2));
    }

    static class Solution {
        public int removeElement(int[] nums, int val) {
            int k = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != val) {
                    nums[k] = nums[j];
                    k++;
                }
            }
            return k;
        }
    }
}
