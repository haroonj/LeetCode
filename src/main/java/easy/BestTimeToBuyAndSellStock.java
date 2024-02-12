package easy;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    static class Solution {
        public int maxProfit(int[] prices) {
            int lsf = Integer.MAX_VALUE;
            int op = 0, best;

            for (int price : prices) {
                if (price < lsf) {
                    lsf = price;
                }
                best = price - lsf;
                if (op < best) {
                    op = best;
                }
            }
            return op;
        }
    }
}
