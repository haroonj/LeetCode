package easy;

import java.util.Arrays;

//https://leetcode.com/problems/plus-one/
public class PlusOne {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.plusOne(new int[]{1,9,9,8})));
    }

    static class Solution {
        public int[] plusOne(int[] digits) {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }

                digits[i] = 0;
            }
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;

            return newDigits;
        }
    }
}
