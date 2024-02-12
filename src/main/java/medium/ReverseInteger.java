package medium;

//https://leetcode.com/problems/reverse-integer/
public class ReverseInteger {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(105638975));
    }

    static class Solution {
        public int reverse(int x) {

            if (x > -2147483648 && x < 2147483647) {
                boolean neg = false;
                if (x < 0) {
                    neg = true;
                    x = x * -1;
                }
                int reversed = 0;
                int rank = 1;

                for (int i = 0; i < (int) Math.log10(x); i++)
                    rank = rank * 10;

                int temp = x;
                for (int i = 0; i < (int) Math.log10(x) + 1; i++) {
                    long t = reversed + (long) (temp % 10) * rank;
                    reversed = reversed + (temp % 10) * rank;
                    if (t != reversed) return 0;
                    temp = temp / 10;
                    rank = rank / 10;
                }
                if (neg) reversed = reversed * -1;
                return reversed;
            } else return 0;
        }
    }
}
