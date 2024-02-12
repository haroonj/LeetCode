package medium;

//https://leetcode.com/problems/unique-paths/
public class UniquePaths {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.uniquePaths(3, 7));
    }

    static class Solution {
        public int uniquePaths(int m, int n) {
            int N = n + m - 2;
            int r = m - 1;
            double result = 1;
            for (int i = 1; i <= r; i++) {
                result = result * (N - r + i) / i;
            }
            return (int) result;
        }
    }
}
