package easy;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(new int[]{1, 1, 2}));
    }

    static class Solution {
        public int removeDuplicates(int[] nums) {
            int currentIndex = 1;
            int prevValue = nums[0];

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != prevValue) {
                    nums[currentIndex] = nums[i];
                    currentIndex++;
                    prevValue = nums[i];
                }
            }
            return currentIndex;
        }
    }
}
