package easy;

//https://leetcode.com/problems/majority-element
public class MajorityElement {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.majorityElement(new int[]{3, 2, 3}));
    }

    static class Solution {
        public int majorityElement(int[] nums) {
            int currentMajor = nums[0];
            int count = 1;

            for (int i = 1; i < nums.length; i++) {
                if (currentMajor == nums[i]) {
                    count++;
                } else if (count > 1) {
                    count--;
                } else {
                    currentMajor = nums[i];
                }
            }
            return currentMajor;
        }
    }
}
