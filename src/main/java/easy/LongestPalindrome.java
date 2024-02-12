package easy;

import java.util.HashSet;
//https://leetcode.com/problems/longest-palindrome/
public class LongestPalindrome {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("abccccdd"));
    }

    static class Solution {
        public int longestPalindrome(String s) {
            if (s.length() == 0) return 0;
            HashSet<Character> hashSet = new HashSet<>();
            int counter = 0;
            for (int i = 0; i < s.length(); i++) {
                if (hashSet.contains(s.charAt(i))) {
                    counter++;
                    hashSet.remove(s.charAt(i));
                } else {
                    hashSet.add(s.charAt(i));
                }
            }
            counter *= 2;
            if (counter < s.length()) {
                return counter + 1;
            } else {
                return counter;
            }
        }
    }
}
