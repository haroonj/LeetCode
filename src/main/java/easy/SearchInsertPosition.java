package easy;

//https://leetcode.com/problems/search-insert-position/
public class SearchInsertPosition {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.searchInsert(new int[]{1, 3, 5, 6}, 7));

    }

    static class Solution {
        public int searchInsert(int[] nums, int target) {
            int mid = nums[nums.length / 2];
            int start;
            int end;

            if (mid > target) {
                start = 0;
                end = nums.length / 2;
            } else {
                start = nums.length / 2;
                end = nums.length;
            }
            int possibleIndex = 0;
            for (int i = start; i < end; i++) {
                if (nums[i] == target)
                    return i;
                else if (nums[i] < target)
                    possibleIndex = i + 1;
                else
                    return i;
            }
            return possibleIndex;
        }
    }
}
