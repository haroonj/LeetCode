package hard;

//https://leetcode.com/problems/trapping-rain-water/
public class TrappingRainWater {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    static class Solution {
        public int trap(int[] height) {
            int left = 0;
            int right = height.length - 1;
            int trappedWater = 0;
            int maxLeft = 0, maxRight = 0;
            while (left < right) {
                if (height[left] < height[right]) {
                    if (height[left] >= maxLeft) {
                        maxLeft = height[left];
                    } else {
                        trappedWater += maxLeft - height[left];
                    }
                    ++left;
                } else {
                    if (height[right] >= maxRight) {
                        maxRight = height[right];
                    } else {
                        trappedWater += maxRight - height[right];
                    }
                    --right;
                }
            }
            return trappedWater;
        }
    }
}
