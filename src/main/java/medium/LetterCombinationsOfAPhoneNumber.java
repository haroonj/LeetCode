package medium;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.letterCombinations("2"));
    }

    static class Solution {
        public List<String> letterCombinations(String digits) {
            List<String> ans = new ArrayList<>();
            if (digits.length() == 0) return ans;

            String[] char_map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

            StringBuilder combination = new StringBuilder();
            backTrack(digits, ans, char_map, combination, 0);
            return ans;
        }

        public void backTrack(String digits, List<String> ans, String[] char_map, StringBuilder combination, int index) {
            if (index > digits.length()) return;
            if (combination.length() == digits.length()) {
                ans.add(combination.toString());
                return;
            }
            int currentDigit = Character.getNumericValue(digits.charAt(index));
            String currentString = char_map[currentDigit];
            for (char c : currentString.toCharArray())
                backTrack(digits, ans, char_map, new StringBuilder(combination).append(c), index + 1);
        }
    }
}
