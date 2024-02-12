package medium;

import java.util.HashMap;

//https://leetcode.com/problems/coin-change/
public class CoinChange {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.coinChange(new int[]{1, 2, 5}, 11));
    }

    static class Solution {
        private final HashMap<Integer, Integer> coinChangeMemoization = new HashMap<>();

        public int coinChange(int[] coins, int amount) {

            if (amount > 0 && coins.length == 0) {
                return -1;
            }

            if (amount == 0) {
                return 0;
            }

            if (coinChangeMemoization.containsKey(amount)) {
                return coinChangeMemoization.get(amount);
            }

            int smallestCoinCount = Integer.MAX_VALUE;
            int coinCount = 0;

            for (int coin : coins) {

                if (amount >= coin) {
                    coinCount = coinChange(coins, amount - coin);

                    if (coinCount >= 0) {
                        coinCount += 1;
                    }
                }

                if (coinCount > 0) {
                    smallestCoinCount = Math.min(coinCount, smallestCoinCount);
                }
            }

            int finalCoinCount;

            if (smallestCoinCount == Integer.MAX_VALUE) {
                finalCoinCount = -1;
            } else {
                finalCoinCount = smallestCoinCount;
            }

            coinChangeMemoization.put(amount, finalCoinCount);

            return finalCoinCount;
        }
    }
}
